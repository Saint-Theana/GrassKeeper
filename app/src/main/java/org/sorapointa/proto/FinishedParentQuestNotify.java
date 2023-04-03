package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ParentQuest.*;
import org.sorapointa.proto.ParentQuest;

public class FinishedParentQuestNotify {
    public enum FinishedParentQuestNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=498) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=3) public List<ParentQuest> parentQuestList = new ArrayList<>();
}
