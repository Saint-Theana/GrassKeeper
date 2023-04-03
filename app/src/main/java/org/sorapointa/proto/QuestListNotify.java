package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Quest.*;
import org.sorapointa.proto.Quest;

public class QuestListNotify {
    public enum QuestListNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=405) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public List<Quest> questList = new ArrayList<>();
}
