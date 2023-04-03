package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MapMarkPoint.*;
import org.sorapointa.proto.MapMarkPoint;

public class AllMarkPointNotify {
    public enum AllMarkPointNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3284) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=6) public List<MapMarkPoint> markList = new ArrayList<>();
}
