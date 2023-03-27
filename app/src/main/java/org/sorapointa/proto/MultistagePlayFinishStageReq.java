package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MultistagePlayFinishStageReq {
    public enum MultistagePlayFinishStageReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5355) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=1) public Integer groupId = null;
    @Tag(tag=3) public Integer playIndex = null;
}
