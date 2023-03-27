package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class InBattleFleurFairInfo {
    @Tag(tag=11) public Integer previewStageIndex = null;
    @Tag(tag=4) public Integer galleryStageIndex = null;
    @Tag(tag=10) public List<Integer> galleryIdList = new ArrayList<>();
    @Tag(tag=9) public Integer previewDisplayDuration = null;
    @Tag(tag=15) public List<Integer> abilityGroupIdList = new ArrayList<>();
}
