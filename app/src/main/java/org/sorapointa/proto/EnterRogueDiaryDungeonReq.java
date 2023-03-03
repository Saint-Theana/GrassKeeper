package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.RogueDiaryAvatar.*;
import org.sorapointa.proto.RogueDiaryAvatar;

public class EnterRogueDiaryDungeonReq {
    @Tag(tag=9) public List<Integer> chosenCardList = new ArrayList<>();
    @Tag(tag=11) public List<RogueDiaryAvatar> chosenAvatarList = new ArrayList<>();
}
