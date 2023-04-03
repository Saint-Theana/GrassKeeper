package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GroupLinkBundle.*;
import org.sorapointa.proto.GroupLinkBundle;

public class GroupLinkMarkUpdateNotify {
    public enum GroupLinkMarkUpdateNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5791) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public GroupLinkBundle bundle = null;
}
