package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RogueFinishRepairReq {
    public enum RogueFinishRepairReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8049) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=4) public List<Integer> chosenCardList = new ArrayList<>();
    @Tag(tag=13) public List<RogueDiaryAvatar> chosenAvatarList = new ArrayList<>();
}
