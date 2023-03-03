package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.TowerLevelStarCondData.*;
import org.sorapointa.proto.TowerLevelStarCondData;

public class TowerLevelStarCondNotify {
    @Tag(tag=14) public Integer levelIndex = null;
    @Tag(tag=11) public Integer floorId = null;
    @Tag(tag=9) public List<TowerLevelStarCondData> condDataList = new ArrayList<>();
}
