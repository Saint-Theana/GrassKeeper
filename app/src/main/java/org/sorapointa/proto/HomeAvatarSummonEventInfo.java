package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeAvatarSummonEventInfo {
    @Tag(tag=4) public Integer suitId = null;
    @Tag(tag=2) public Integer randomPosition = null;
    @Tag(tag=3) public Integer eventId = null;
    @Tag(tag=12) public Integer avatarId = null;
    @Tag(tag=14) public Integer eventOverTime = null;
    @Tag(tag=1) public Integer guid = null;
}
