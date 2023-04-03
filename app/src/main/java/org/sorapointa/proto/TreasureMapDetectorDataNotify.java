package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.TreasureMapDetectorData.*;
import org.sorapointa.proto.TreasureMapDetectorData;

public class TreasureMapDetectorDataNotify {
    public enum TreasureMapDetectorDataNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4298) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=6) public TreasureMapDetectorData data = null;
}
