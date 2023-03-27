package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class QuestProgressUpdateNotify {
    public enum QuestProgressUpdateNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=406) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public Integer questId = null;
    @Tag(tag=11) public List<Integer> failProgressList = new ArrayList<>();
    @Tag(tag=1) public List<Integer> finishProgressList = new ArrayList<>();
}
