package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.DetectorData.*;
import org.sorapointa.proto.DetectorData;

public class OneoffGatherPointDetectorDataNotify {
    public enum OneoffGatherPointDetectorDataNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4257) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10) public List<DetectorData> oneoffGatherPointDetectorDataList = new ArrayList<>();
}
