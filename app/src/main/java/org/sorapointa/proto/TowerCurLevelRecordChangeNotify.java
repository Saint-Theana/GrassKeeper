package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.TowerCurLevelRecord.*;
import org.sorapointa.proto.TowerCurLevelRecord;

public class TowerCurLevelRecordChangeNotify {
    @Tag(tag=10) public TowerCurLevelRecord curLevelRecord = null;
}
