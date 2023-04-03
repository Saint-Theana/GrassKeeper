package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AnchorPointData.*;
import org.sorapointa.proto.AnchorPointData;

public class AnchorPointDataNotify {
    public enum AnchorPointDataNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4288) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10) public Integer nextUsableTime = null;
    @Tag(tag=11) public List<AnchorPointData> anchorPointList = new ArrayList<>();
}
