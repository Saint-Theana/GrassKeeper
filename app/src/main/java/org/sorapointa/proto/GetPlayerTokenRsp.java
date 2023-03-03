package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetPlayerTokenRsp {
    @Tag(tag=937) public String birthday = null;
    @Tag(tag=2,isSigned=true) public Integer retcode = null;
    @Tag(tag=6) public byte[] securityCmdBuffer = null;
    @Tag(tag=13) public Long secretKeySeed = null;
    @Tag(tag=2013) public String countryCode = null;
    @Tag(tag=3) public byte[] extraBinData = null;
    @Tag(tag=15) public String secretKey = null;
    @Tag(tag=1561) public Integer minorsRegMinAge = null;
    @Tag(tag=14) public Integer blackUidEndTime = null;
    @Tag(tag=1635) public Integer tag = null;
    @Tag(tag=11) public String token = null;
    @Tag(tag=10) public Integer gmUid = null;
    @Tag(tag=896) public Integer channelId = null;
    @Tag(tag=1811) public String psnId = null;
    @Tag(tag=860) public String clientIpStr = null;
    @Tag(tag=7) public String msg = null;
    @Tag(tag=5) public Integer accountType = null;
    @Tag(tag=1802) public Integer subChannelId = null;
    @Tag(tag=2028) public Boolean isWatchdogUid = null;
    @Tag(tag=1493) public String serverRandKey = null;
    @Tag(tag=9) public Boolean isProficientPlayer = null;
    @Tag(tag=1172) public Integer keyId = null;
    @Tag(tag=1) public Integer uid = null;
    @Tag(tag=12) public String accountUid = null;
    @Tag(tag=4) public Boolean isGuest = null;
    @Tag(tag=1529) public String clientVersionRandomKey = null;
    @Tag(tag=1640) public List<Integer> finishCollectionIdList = new ArrayList<>();
    @Tag(tag=8) public Integer platformType = null;
    @Tag(tag=1112) public Integer regPlatform = null;
    @Tag(tag=573) public Boolean isLoginWhiteList = null;
    @Tag(tag=1140) public String sign = null;
}
