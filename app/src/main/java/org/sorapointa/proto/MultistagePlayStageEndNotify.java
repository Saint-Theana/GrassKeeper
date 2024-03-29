package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MultistagePlayStageEndNotify {
    public enum MultistagePlayStageEndNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5341) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public Integer groupId = null;
    @Tag(tag=14) public Integer playIndex = null;
}
