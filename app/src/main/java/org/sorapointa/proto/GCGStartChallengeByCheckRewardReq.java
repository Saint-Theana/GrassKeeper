package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGStartChallengeByCheckRewardReq {
    public enum CNMDOPLFCKF {
        @Tag(tag=0) None ,
        @Tag(tag=7187) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=7) public Integer levelId = null;
    @Tag(tag=11) public Integer levelType = null;
    @Tag(tag=13) public Integer configId = null;
}
