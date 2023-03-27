package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TowerCurLevelRecordChangeNotify {
    public enum TowerCurLevelRecordChangeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2487) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5) public TowerCurLevelRecord curLevelRecord = null;
}
