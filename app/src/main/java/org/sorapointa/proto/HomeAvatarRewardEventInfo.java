package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeAvatarRewardEventInfo {
    @Tag(tag=6) public Integer avatarId = null;
    @Tag(tag=4) public Integer randomPosition = null;
    @Tag(tag=14) public Integer eventId = null;
    @Tag(tag=5) public Integer guid = null;
    @Tag(tag=2) public Integer suiteId = null;
}
