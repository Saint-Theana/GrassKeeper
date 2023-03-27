package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerLoginReq {
    public enum PlayerLoginReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=187) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=6) public String token = null;
    @Tag(tag=323) public Integer targetHomeParam = null;
    @Tag(tag=4) public Integer targetUid = null;
    @Tag(tag=1738) public String checksumClientVersion = null;
    @Tag(tag=9) public String accountUid = null;
    @Tag(tag=13) public Boolean isEditor = null;
    @Tag(tag=1280) public String birthday = null;
    @Tag(tag=78) public byte[] extraBinData = null;
    @Tag(tag=119) public Integer regPlatform = null;
    @Tag(tag=246) public Integer gmUid = null;
    @Tag(tag=1715) public String checksum = null;
    @Tag(tag=12) public Integer platformType = null;
    @Tag(tag=710) public TrackingIOInfo trackingIoInfo = null;
    @Tag(tag=1762) public Integer clientToken = null;
    @Tag(tag=14) public String deviceInfo = null;
    @Tag(tag=216) public Integer targetHomeOwnerUid = null;
    @Tag(tag=2) public String platform = null;
    @Tag(tag=324) public Integer channelId = null;
    @Tag(tag=1616) public String countryCode = null;
    @Tag(tag=8) public Long loginRand = null;
    @Tag(tag=54) public String onlineId = null;
    @Tag(tag=1709) public Integer subChannelId = null;
    @Tag(tag=15) public String deviceUuid = null;
    @Tag(tag=2024) public Integer clientPort = null;
    @Tag(tag=1765) public String clientVerisonHash = null;
    @Tag(tag=442) public AdjustTrackingInfo adjustTrackingInfo = null;
    @Tag(tag=7) public Integer accountType = null;
    @Tag(tag=1568) public String psnId = null;
    @Tag(tag=1223) public Integer tag = null;
    @Tag(tag=1394) public Integer cloudClientIp = null;
    @Tag(tag=3) public String systemVersion = null;
    @Tag(tag=10) public Boolean isGuest = null;
    @Tag(tag=11) public String clientVersion = null;
    @Tag(tag=2037) public Boolean isTransfer = null;
    @Tag(tag=1015) public byte[] environmentErrorCode = null;
    @Tag(tag=1) public String deviceName = null;
    @Tag(tag=378) public String securityLibraryMd5 = null;
    @Tag(tag=5) public Integer languageType = null;
    @Tag(tag=907) public byte[] securityCmdReply = null;
    @Tag(tag=684) public String securityLibraryVersion = null;
    @Tag(tag=426) public Integer clientDataVersion = null;
    @Tag(tag=821) public String cps = null;
}
