package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ActivityDungeonAvatar.*;
import org.sorapointa.proto.ActivityDungeonAvatar;
import org.sorapointa.proto.RogueDiaryAvatarDisableStatus.*;
import org.sorapointa.proto.RogueDiaryAvatarDisableStatus;

public class RogueDiaryAvatar {
    @Tag(tag=2) public ActivityDungeonAvatar avatar = null;
    @Tag(tag=14) public Integer level = null;
    @Tag(tag=13) public Integer tiredRound = null;
    @Tag(tag=9) public List<Integer> disableStatusList = new ArrayList<>();
}
