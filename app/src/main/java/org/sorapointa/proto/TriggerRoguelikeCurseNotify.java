package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TriggerRoguelikeCurseNotify {
    public enum TriggerRoguelikeCurseNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8642) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public Boolean isTriggerCurse = null;
    @Tag(tag=13) public Integer curseGroupId = null;
    @Tag(tag=6) public List<Integer> effectParamList = new ArrayList<>();
    @Tag(tag=5) public Integer curseLevel = null;
}
