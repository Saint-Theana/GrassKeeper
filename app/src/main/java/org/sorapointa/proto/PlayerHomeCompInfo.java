package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FriendEnterHomeOption.*;
import org.sorapointa.proto.FriendEnterHomeOption;

public class PlayerHomeCompInfo {
    @Tag(tag=4) public List<Integer> unlockedModuleIdList = new ArrayList<>();
    @Tag(tag=2) public List<Integer> seenModuleIdList = new ArrayList<>();
    @Tag(tag=7) public List<Integer> levelupRewardGotLevelList = new ArrayList<>();
    @Tag(tag=8) public Integer friendEnterHomeOption = null;
}
