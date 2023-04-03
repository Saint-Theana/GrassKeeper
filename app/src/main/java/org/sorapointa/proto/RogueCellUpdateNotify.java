package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.RogueCellInfo.*;
import org.sorapointa.proto.RogueCellInfo;

public class RogueCellUpdateNotify {
    public enum RogueCellUpdateNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8067) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public RogueCellInfo cellInfo = null;
}
