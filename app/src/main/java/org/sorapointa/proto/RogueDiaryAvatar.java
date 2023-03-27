package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RogueDiaryAvatar {
    @Tag(tag=4) public List<Integer> disableStatusList = new ArrayList<>();
    @Tag(tag=2) public Integer level = null;
    @Tag(tag=9) public Integer tiredRound = null;
    @Tag(tag=6) public ActivityDungeonAvatar avatar = null;
}
