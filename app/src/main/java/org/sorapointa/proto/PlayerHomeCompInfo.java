package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerHomeCompInfo {
    @Tag(tag=2) public List<Integer> seenModuleIdList = new ArrayList<>();
    @Tag(tag=4) public Integer friendEnterHomeOption = null;
    @Tag(tag=10) public List<Integer> unlockedModuleIdList = new ArrayList<>();
    @Tag(tag=12) public List<Integer> levelupRewardGotLevelList = new ArrayList<>();
}
