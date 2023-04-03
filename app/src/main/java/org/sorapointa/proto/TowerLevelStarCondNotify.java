package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.TowerLevelStarCondData.*;
import org.sorapointa.proto.TowerLevelStarCondData;

public class TowerLevelStarCondNotify {
    public enum TowerLevelStarCondNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2485) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public Integer floorId = null;
    @Tag(tag=4) public Integer levelIndex = null;
    @Tag(tag=15) public List<TowerLevelStarCondData> condDataList = new ArrayList<>();
}
