package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.RogueDiaryAvatar.*;
import org.sorapointa.proto.RogueDiaryAvatar;

public class RogueFinishRepairReq {
    @Tag(tag=1) public List<Integer> chosenCardList = new ArrayList<>();
    @Tag(tag=8) public List<RogueDiaryAvatar> chosenAvatarList = new ArrayList<>();
}
