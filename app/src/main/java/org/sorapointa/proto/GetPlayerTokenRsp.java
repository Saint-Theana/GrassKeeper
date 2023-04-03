package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.StopServer.*;
import org.sorapointa.proto.StopServer;

public class GetPlayerTokenRsp {
    public enum GetPlayerTokenRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=155) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=891) public Integer subChannelId = null;
    @Tag(tag=6) public String token = null;
    @Tag(tag=1) public Integer uid = null;
    @Tag(tag=12) public String secretKey = null;
    @Tag(tag=3) public Integer accountType = null;
    @Tag(tag=10) public String msg = null;
    @Tag(tag=661) public Boolean isWatchdogUid = null;
    @Tag(tag=13) public byte[] securityCmdBuffer = null;
    @Tag(tag=15,isSigned=true) public Integer retcode = null;
    @Tag(tag=14) public byte[] extraBinData = null;
    @Tag(tag=1558) public String clientVersionRandomKey = null;
    @Tag(tag=1960) public String countryCode = null;
    @Tag(tag=2003) public Integer keyId = null;
    @Tag(tag=1459) public String birthday = null;
    @Tag(tag=5) public Integer gmUid = null;
    @Tag(tag=8) public Long secretKeySeed = null;
    @Tag(tag=2) public Integer blackUidEndTime = null;
    @Tag(tag=1356) public Integer channelId = null;
    @Tag(tag=1614) public Integer regPlatform = null;
    @Tag(tag=11) public Integer platformType = null;
    @Tag(tag=4) public Boolean isGuest = null;
    @Tag(tag=1846) public List<Integer> finishCollectionIdList = new ArrayList<>();
    @Tag(tag=1344) public Integer tag = null;
    @Tag(tag=9) public String accountUid = null;
    @Tag(tag=7) public Boolean isProficientPlayer = null;
    @Tag(tag=1993) public String sign = null;
    @Tag(tag=347) public StopServer stopServer = null;
    @Tag(tag=1285) public String psnId = null;
    @Tag(tag=1481) public Integer minorsRegMinAge = null;
    @Tag(tag=64) public String clientIpStr = null;
    @Tag(tag=1420) public String serverRandKey = null;
    @Tag(tag=1663) public Boolean isLoginWhiteList = null;
}
