package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HideAndSeekPlayerBattleInfo {
    @Tag(tag=5) public Integer costumeId = null;
    @Tag(tag=13) public Boolean isReady = null;
    @Tag(tag=3) public List<Integer> skillList = new ArrayList<>();
    @Tag(tag=11) public Integer avatarId = null;
}
