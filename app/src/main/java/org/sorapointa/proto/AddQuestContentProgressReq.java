package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AddQuestContentProgressReq {
    public enum AddQuestContentProgressReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=474) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=2) public Integer addProgress = null;
    @Tag(tag=9) public Integer param = null;
    @Tag(tag=14) public Integer contentType = null;
}
