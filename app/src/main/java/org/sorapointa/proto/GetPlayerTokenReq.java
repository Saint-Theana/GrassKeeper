package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetPlayerTokenReq {
    @Tag(tag=10) public String accountToken = null;
    @Tag(tag=11) public String accountUid = null;
    @Tag(tag=4) public String psnRegion = null;
    @Tag(tag=7) public String onlineId = null;
    @Tag(tag=15) public Integer channelId = null;
    @Tag(tag=9) public String accountExt = null;
    @Tag(tag=5) public String countryCode = null;
    @Tag(tag=760) public String clientRandKey = null;
    @Tag(tag=6) public Boolean isGuest = null;
    @Tag(tag=1718) public String birthday = null;
    @Tag(tag=8) public Integer subChannelId = null;
    @Tag(tag=12) public Integer platformType = null;
    @Tag(tag=3) public String clientIpStr = null;
    @Tag(tag=13) public String psnId = null;
    @Tag(tag=1) public Integer accountType = null;
    @Tag(tag=995) public Integer minorsRegMinAge = null;
    @Tag(tag=14) public Integer cloudClientIp = null;
    @Tag(tag=1787) public Integer keyId = null;
    @Tag(tag=2) public Integer uid = null;
}
