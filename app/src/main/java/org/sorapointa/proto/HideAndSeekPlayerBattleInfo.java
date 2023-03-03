package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HideAndSeekPlayerBattleInfo {
    @Tag(tag=3) public Integer costumeId = null;
    @Tag(tag=15) public List<Integer> skillList = new ArrayList<>();
    @Tag(tag=12) public Boolean isReady = null;
    @Tag(tag=6) public Integer avatarId = null;
}
