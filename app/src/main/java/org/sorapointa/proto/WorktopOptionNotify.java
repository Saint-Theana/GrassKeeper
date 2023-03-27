package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WorktopOptionNotify {
    public enum WorktopOptionNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=898) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public List<Integer> optionList = new ArrayList<>();
    @Tag(tag=15) public Integer gadgetEntityId = null;
}
