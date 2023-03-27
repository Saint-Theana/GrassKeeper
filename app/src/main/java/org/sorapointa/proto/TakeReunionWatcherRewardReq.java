package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TakeReunionWatcherRewardReq {
    public enum TakeReunionWatcherRewardReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5052) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=4) public Integer watcherId = null;
    @Tag(tag=15) public Integer missionId = null;
}
