package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class StartRogueDiaryPlayReq {
    public enum StartRogueDiaryPlayReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8484) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=8) public Integer stageId = null;
    @Tag(tag=12) public Integer difficulty = null;
}
