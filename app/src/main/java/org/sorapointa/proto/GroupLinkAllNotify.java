package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GroupLinkAllNotify {
    public enum GroupLinkAllNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5788) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public List<GroupLinkBundle> bundleList = new ArrayList<>();
}
