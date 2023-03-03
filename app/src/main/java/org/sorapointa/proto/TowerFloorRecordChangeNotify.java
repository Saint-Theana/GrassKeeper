package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.TowerFloorRecord.*;
import org.sorapointa.proto.TowerFloorRecord;

public class TowerFloorRecordChangeNotify {
    @Tag(tag=11) public Boolean isFinishedEntranceFloor = null;
    @Tag(tag=8) public List<TowerFloorRecord> towerFloorRecordList = new ArrayList<>();
}
