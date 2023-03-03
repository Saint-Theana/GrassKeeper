package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class InBattleFleurFairInfo {
    @Tag(tag=5) public List<Integer> galleryIdList = new ArrayList<>();
    @Tag(tag=6) public Integer galleryStageIndex = null;
    @Tag(tag=8) public Integer previewStageIndex = null;
    @Tag(tag=2) public List<Integer> abilityGroupIdList = new ArrayList<>();
    @Tag(tag=12) public Integer previewDisplayDuration = null;
}
