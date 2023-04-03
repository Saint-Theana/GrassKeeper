package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.TowerFloorRecord.*;
import org.sorapointa.proto.TowerFloorRecord;

public class TowerFloorRecordChangeNotify {
    public enum TowerFloorRecordChangeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2455) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11) public Boolean isFinishedEntranceFloor = null;
    @Tag(tag=12) public List<TowerFloorRecord> towerFloorRecordList = new ArrayList<>();
}
