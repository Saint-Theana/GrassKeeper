package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RogueSwitchAvatarReq {
    @Tag(tag=15) public Integer cellId = null;
    @Tag(tag=3) public List<Long> onstageAvatarGuidList = new ArrayList<>();
    @Tag(tag=11) public Long curAvatarGuid = null;
    @Tag(tag=6) public Integer dungeonId = null;
}
