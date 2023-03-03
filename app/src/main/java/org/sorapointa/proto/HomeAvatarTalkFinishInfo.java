package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeAvatarTalkFinishInfo {
    @Tag(tag=9) public Integer avatarId = null;
    @Tag(tag=3) public List<Integer> finishTalkIdList = new ArrayList<>();
}
