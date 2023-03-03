package com.ulcade.client;
import com.ulcade.PublicConstant;
import com.ulcade.crypto.Crypto;
import com.ulcade.crypto.Ec2b;
import com.ulcade.info.ComboLoginResultInfo;
import com.ulcade.info.LoginResultInfo;
import com.ulcade.net.AccountLoginInfoRetriver;
import com.ulcade.net.AccountTokenLoginInfoRetriver;
import com.ulcade.net.CurrentRegionInfoRetriver;
import com.ulcade.net.RegionInfoRetriver;
import com.ulcade.packet.BasePacket;
import com.ulcade.packet.ClientPacketHandler;
import com.ulcade.packet.Opcode;
import com.ulcade.packet.PacketAskAddFriendReq;
import com.ulcade.packet.PacketDealAddFriendReq;
import com.ulcade.packet.PacketDeleteFriendReq;
import com.ulcade.packet.PacketGetPlayerFriendListReq;
import com.ulcade.packet.PacketPlayerApplyEnterHomeResultReq;
import com.ulcade.packet.PacketPlayerApplyEnterMpResultReq;
import com.ulcade.packet.PacketGetPlayerTokenReq;
import com.ulcade.packet.PacketPrivateChatReq;
import com.ulcade.sdk.FriendInfo;
import com.ulcade.util.Util;
import io.github.sainttheana.BasicTerminal;
import io.jpower.kcp.netty.ChannelOptionHelper;
import io.jpower.kcp.netty.UkcpChannel;
import io.jpower.kcp.netty.UkcpChannelOption;
import io.jpower.kcp.netty.UkcpClientChannel;
import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.sorapointa.proto.PlayerApplyEnterMpResultReq;
import org.sorapointa.proto.QueryCurrRegionHttpRsp;
import org.sorapointa.proto.QueryRegionListHttpRsp;
import org.sorapointa.proto.RegionSimpleInfo;
import com.ulcade.packet.PacketPlayerChatReq;

public class GameClient extends ChannelInboundHandlerAdapter implements Runnable,ThreadFactory
{
	private ScheduledExecutorService scheduledThreadPool;

	private double totalTickTime;
	
	private float ueTime=28.7062492f;

	private Robot robot;

	private List<FriendInfo> friendInfos=new ArrayList<FriendInfo>();

	public User getUser()
	{
		return user;
	}

	public ClientConfig getClientConfig()
	{
		return clientInfo;
	}

	public void sendChannelMessage(Integer channelId, int icon)
	{
		PacketPlayerChatReq req=new PacketPlayerChatReq(this);
		req.setChannelId(channelId);
		req.setIcon(icon);
		send(req);
	}

	public void sendChannelMessage(Integer channelId, String text)
	{
		PacketPlayerChatReq req=new PacketPlayerChatReq(this);
		req.setChannelId(channelId);
		req.setText(text);
		send(req);
	}

	public void dealWorldEnterRequest(int uid, boolean accept)
	{
		PacketPlayerApplyEnterMpResultReq packet=new PacketPlayerApplyEnterMpResultReq(this);
		packet.setTargetUid(uid);
		packet.setAccept(accept);
		send(packet);
	}

	public void dealHomeEnterRequest(int uid, boolean accept)
	{
		PacketPlayerApplyEnterHomeResultReq packet=new PacketPlayerApplyEnterHomeResultReq(this);
		packet.setTargetUid(uid);
		packet.setAccept(accept);
		send(packet);
	}

	public void requestDeleteFriend(int uid)
	{
		PacketDeleteFriendReq packet=new PacketDeleteFriendReq(this);
		packet.setUid(uid);
		send(packet);
	}

	public void requestAddFriend(int uid)
	{
		PacketAskAddFriendReq packet=new PacketAskAddFriendReq(this);
		packet.setUid(uid);
		send(packet);
	}

	public void dealAddFriendRequest(int uid, boolean accept)
	{
		PacketDealAddFriendReq packet=new PacketDealAddFriendReq(this);
		packet.setUid(uid);
		packet.setAccept(accept);
		send(packet);
	}

	public void deleteFriendByUid(int target_uid)
	{
		FriendInfo target=null;
		for(FriendInfo info:friendInfos){
			if(info.uid==target_uid){
				target=info;
			}
		}
		if(target==null){
			return;
		}
		friendInfos.remove(target);
	}

	//private HeartbeatThread heartbeat;

	public void stop()
	{
		ctx.close();
		executor.shutdown();
		scheduledThreadPool.shutdown();
	}

	public List<FriendInfo> getFriendList()
	{
		return friendInfos;
	}

	public void updatePlayerFriendList(List<FriendInfo> friendInfos)
	{
		this.friendInfos=friendInfos;
	}
	
	public void updatePlayerFriendList()
	{
		send(new PacketGetPlayerFriendListReq(this));
	}

	public Robot getRobot()
	{
		return robot;
	}

	public void sendPrivateMessage(int uid, String text)
	{
		PacketPrivateChatReq req=new PacketPrivateChatReq(this);
		req.setTargetUid(uid);
		req.setText(text);
		send(req);
	}

	public void sendPrivateMessage(int uid, int icon)
	{
		PacketPrivateChatReq req=new PacketPrivateChatReq(this);
		req.setTargetUid(uid);
		req.setIcon(icon);
		send(req);
	}

	public float getUeTime()
	{
		ueTime+=3;
		return ueTime;
	}

	@Override
	public void channelInactive(ChannelHandlerContext ctx) throws Exception
	{
		scheduledThreadPool.shutdown();
		//System.err.println("channelInactive");
		super.channelInactive(ctx);
	}
	
	

	public void setTotalTickTime(double totalTickTime)
	{
		this.totalTickTime = totalTickTime;
	}

	public double getTotalTickTime()
	{
		totalTickTime+=5;
		return totalTickTime;
	}

	public void startHeartBeat()
	{
		HeartbeatThread heartbeat=new HeartbeatThread(this, user, clientInfo);
		scheduledThreadPool.scheduleAtFixedRate(heartbeat, 0, 5, TimeUnit.SECONDS);
	}

	@Override
	public Thread newThread(Runnable p1)
	{
		if(p1 instanceof HeartbeatThread){
			return new Thread(p1,"client-heartbeat"+p1.hashCode());
		}
		return new Thread(p1,"client"+p1.hashCode());
	}
	
	private ThreadPoolExecutor executor=new ThreadPoolExecutor(15, 30, 1000, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>(10), this, new ThreadPoolExecutor.DiscardOldestPolicy());

	private BasicTerminal terminal;

	private QueryCurrRegionHttpRsp currentRegionInfo;

	private LoginResultInfo loginResultInfo;
	
	private ComboLoginResultInfo comboLoginResultInfo;

	private byte[] xorKey;

	private ClientPacketHandler packetHandler;

	private long clientSeed = Long.parseUnsignedLong("6860938962650654720");

	private long serverSeed;

	public BasicTerminal getTerminal()
	{
		return terminal;
	}

	public long getServerSeed()
	{
		return serverSeed;
	}

	public void setServerSeed(long seed)
	{
		serverSeed=seed;
	}

	public long getClientSeed()
	{
		return clientSeed;
	}
	
	public void setXorKey(byte[] generateNewXorKey)
	{
		xorKey=generateNewXorKey;
	}
	
	public byte[] getXorKey()
	{
		return xorKey;
	}

	public QueryCurrRegionHttpRsp getCurrentRegionInfo()
	{
		return currentRegionInfo;
	}

	public void setRegionSelector(RegionSelector select)
	{
		this.regionSelector = select;
	}
	public interface RegionSelector
	{
		int select(String[] regions);
	}

	private QueryRegionListHttpRsp regionInfo;

	private RegionSelector regionSelector;

	
	UkcpChannel kcpCh=null;

	private ChannelHandlerContext ctx;
	
	public int getConv()
	{
		
		return kcpCh.conv();
	}
	
	public int getPort(){
		return kcpCh.localAddress().getPort();
	}
	
	public void send(BasePacket packet)
	{
		if(PublicConstant.printCmd){
		    System.out.println("send packet "+Opcode.getNameByValue(packet.getOpcode()));
		}
		byte[] data=packet.build();
		Crypto.xor(data,xorKey);
		ByteBuf buf=Unpooled.wrappedBuffer(data);
		ctx.writeAndFlush(buf);
	}
	
    @Override
    public void channelActive(final ChannelHandlerContext ctx)
	{
		kcpCh  = (UkcpChannel) ctx.channel();
		this.ctx = ctx;
		if(getConv()!=0){
			this.xorKey=Ec2b.generateXorKey(currentRegionInfo.regionInfo.secretKey);
			PacketGetPlayerTokenReq playerLoginReq =new PacketGetPlayerTokenReq(this);
			send(playerLoginReq);
		}
    }

    @Override
    public void channelRead(final ChannelHandlerContext ctx, final Object msg)
	{
		executor.execute(new Runnable(){
				@Override
				public void run()
				{
					handleRead(ctx,msg);
				}
		});
    }

	private void handleRead(ChannelHandlerContext ctx, Object msg)
	{
		ByteBuf buf=(ByteBuf) msg;
		byte[] data =Util.bufToBytes(buf);
		
		Crypto.xor(data,xorKey);
		ByteBuf packet = Unpooled.wrappedBuffer(data);
      
        try {
            while (packet.readableBytes() > 0) {
                // Length
                if (packet.readableBytes() < 12) {
                    return;
                }
                // Packet sanity check
                int const1 = packet.readShort();
                if (const1 != 17767) {
                    System.out.println("Bad Data Package Received: got "+const1+" ,expect 17767");
                    return; // Bad packet
                }
                // Data
                int opcode = packet.readShort();
                int headerLength = packet.readShort();
                int payloadLength = packet.readInt();
                byte[] header = new byte[headerLength];
                byte[] payload = new byte[payloadLength];

                packet.readBytes(header);
                packet.readBytes(payload);
                // Sanity check #2
                int const2 = packet.readShort();
                if (const2 != -30293) {
                    System.out.println("Bad Data Package Received: got "+const2+" ,expect -30293");

                    return; // Bad packet
                }
                // Handle
                packetHandler.handle(opcode, header, payload);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //byteBuf.release(); //Needn't
            packet.release();
			buf.release();
        }
	}

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx)
	{
		//System.out.println("channelReadComplete");
        ctx.flush();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause)
	{
		//System.out.println("exceptionCaught");
        // Close the connection when an exception is raised.
        cause.printStackTrace();
        ctx.close();
    }
	
	@Override
	public void run()
	{
		//System.out.println("fff");
		this.regionInfo = new RegionInfoRetriver(user, clientInfo).process();
		if(user.accountToken!=null){
			//loginwithToken
			this.comboLoginResultInfo=new AccountTokenLoginInfoRetriver(user, clientInfo).process();
		}else{
			//loginWithPassword
			this.loginResultInfo=new AccountLoginInfoRetriver(user, clientInfo).process();
		}
		if(loginResultInfo!=null){
			if(loginResultInfo.retcode!=0){
				System.out.println(loginResultInfo.message);
				System.out.println("login failed.");
				return;
			}else{
				user.uid=Integer.parseInt(loginResultInfo.data.account.uid);
				user.account=loginResultInfo.data.account.name;
				user.password=null;
				user.accountToken=loginResultInfo.data.account.token;
				saveUserData(user);
			}
		}else if(comboLoginResultInfo!=null){
			//System.err.println(PublicConstant.gson.toJson(comboLoginResultInfo));
			if(comboLoginResultInfo.retcode!=0){
				System.out.println(comboLoginResultInfo.message);
				System.out.println("combo login failed,login record will be deleted,please relogin.");
				user.accountToken=null;
				user.uid=0;
				user.account=null;
				user.selectedRegion=null;
				saveUserData(user);
				return;
			}
		}else{
			throw new RuntimeException("unknown error.");
		}
		RegionSimpleInfo selectedRegion=null;
		if (regionInfo.regionList.size() > 1)
		{
			if (user.selectedRegion == null)
			{
				if (regionSelector == null)
				{
					System.out.println("regionSelector is null,please set one");
				}
				else
				{
					selectedRegion = regionInfo.regionList.get(regionSelector.select(getAllNamesFromRegions(regionInfo.regionList)));
					user.selectedRegion = selectedRegion.name;
					saveUserData(user);
				}
			}
			else
			{
				selectedRegion = getRegionByName(user.selectedRegion, regionInfo.regionList);
			}
		}
		else
		{
			selectedRegion = regionInfo.regionList.get(0);
		}
		this.currentRegionInfo = new CurrentRegionInfoRetriver(user, clientInfo).process(selectedRegion.dispatchUrl);
		//System.err.println(PublicConstant.gson.toJson(currentRegionInfo));

		EventLoopGroup group = new NioEventLoopGroup();
        try {
            Bootstrap b = new Bootstrap();
            b.group(group)
				.channel(UkcpClientChannel.class)
				.handler(new ChannelInitializer<UkcpChannel>() {
					@Override
					public void initChannel(UkcpChannel ch) throws Exception {
						ChannelPipeline p = ch.pipeline();
						p.addLast(GameClient.this);
					}
				});
            ChannelOptionHelper.nodelay(b, true, 20, 2, true)
			.option(UkcpChannelOption.UKCP_AUTO_SET_CONV, true)
				.option(UkcpChannelOption.UKCP_MTU, 1024);

            // Start the client.
			//todo: domain support
            ChannelFuture f = b.connect(currentRegionInfo.regionInfo.gateserverIp, currentRegionInfo.regionInfo.gateserverPort).sync();
            // Wait until the connection is closed.
			
            f.channel().closeFuture().sync();
	    }catch(Exception e){
			e.printStackTrace();
		
        } finally {
            // Shut down the event loop to terminate all threads.
            group.shutdownGracefully();
        }
	}

	private void saveUserData(User user)
	{
		try
		{
			Files.write(new File("conf/user.json").toPath(), PublicConstant.gson.toJson(user).getBytes());
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	private RegionSimpleInfo getRegionByName(String selectedRegion, List<RegionSimpleInfo> region_list)
	{
		for (RegionSimpleInfo info:region_list)
		{
			if (info.name.equals(selectedRegion))
			{
				return info;
			}
		}
		throw new RuntimeException("did not find selected region: " + selectedRegion);
	}




	private String[] getAllNamesFromRegions(List<RegionSimpleInfo> region_list)
	{
		String[] names=new String[region_list.size()];
		for (int i=0;i < region_list.size();i += 1)
		{
			names[i] = region_list.get(i).name;
		}
		return names;
	}

	private User user;

	private ClientConfig clientInfo;

	public GameClient(User user, ClientConfig clientInfo, BasicTerminal terminal)
	{
		this.user = user;
		this.clientInfo = clientInfo;
		this.terminal = terminal;
		this.robot=new Robot(this);
		scheduledThreadPool = Executors.newScheduledThreadPool(3, this);
		packetHandler=new ClientPacketHandler(this,user,clientInfo);
	}
}
