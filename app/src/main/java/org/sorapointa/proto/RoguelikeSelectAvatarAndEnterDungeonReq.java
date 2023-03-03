package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RoguelikeSelectAvatarAndEnterDungeonReq {
    @Tag(tag=14) public List<Long> onstageAvatarGuidList = new ArrayList<>();
    @Tag(tag=4) public Integer stageId = null;
    @Tag(tag=11) public List<Long> backstageAvatarGuidList = new ArrayList<>();
}
