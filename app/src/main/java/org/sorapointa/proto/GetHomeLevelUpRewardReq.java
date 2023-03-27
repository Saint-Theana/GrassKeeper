package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetHomeLevelUpRewardReq {
    public enum GetHomeLevelUpRewardReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4588) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=13) public Integer level = null;
}
