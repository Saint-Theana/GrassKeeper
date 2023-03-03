package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PotionLevelData.*;
import org.sorapointa.proto.PotionLevelData;

public class PotionStageData {
    @Tag(tag=11) public Integer stageId = null;
    @Tag(tag=2) public List<Integer> coolDownBuffIdList = new ArrayList<>();
    @Tag(tag=15) public Boolean isOpen = null;
    @Tag(tag=14) public List<PotionLevelData> levelList = new ArrayList<>();
    @Tag(tag=13) public List<Integer> coolDownAvatarIdList = new ArrayList<>();
}
