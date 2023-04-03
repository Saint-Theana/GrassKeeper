package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GroupLinkBundle.*;
import org.sorapointa.proto.GroupLinkBundle;

public class GroupLinkChangeNotify {
    public enum GroupLinkChangeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5795) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2) public GroupLinkBundle bundle = null;
}
