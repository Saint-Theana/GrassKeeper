package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetPlayerTokenReq {
    public enum GetPlayerTokenReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=105) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=10) public Integer platformType = null;
    @Tag(tag=6) public String accountExt = null;
    @Tag(tag=1) public String countryCode = null;
    @Tag(tag=8) public String clientIpStr = null;
    @Tag(tag=13) public Integer cloudClientIp = null;
    @Tag(tag=294) public Integer keyId = null;
    @Tag(tag=9) public String psnRegion = null;
    @Tag(tag=5) public Integer accountType = null;
    @Tag(tag=14) public Boolean isGuest = null;
    @Tag(tag=1399) public Integer minorsRegMinAge = null;
    @Tag(tag=65) public String birthday = null;
    @Tag(tag=12) public String onlineId = null;
    @Tag(tag=11) public Integer uid = null;
    @Tag(tag=776) public String clientRandKey = null;
    @Tag(tag=7) public Integer subChannelId = null;
    @Tag(tag=4) public String accountUid = null;
    @Tag(tag=2) public String accountToken = null;
    @Tag(tag=15) public String psnId = null;
    @Tag(tag=3) public Integer channelId = null;
    @Tag(tag=904) public Integer lang = null;
}
