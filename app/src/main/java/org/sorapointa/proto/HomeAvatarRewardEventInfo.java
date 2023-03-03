package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeAvatarRewardEventInfo {
    @Tag(tag=1) public Integer avatarId = null;
    @Tag(tag=12) public Integer guid = null;
    @Tag(tag=2) public Integer eventId = null;
    @Tag(tag=14) public Integer suiteId = null;
    @Tag(tag=9) public Integer randomPosition = null;
}
