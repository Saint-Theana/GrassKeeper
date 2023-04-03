package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MapMarkPoint.*;
import org.sorapointa.proto.MapMarkPoint;

public class MarkMapRsp {
    public enum MarkMapRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3413) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=1,isSigned=true) public Integer retcode = null;
    @Tag(tag=5) public List<MapMarkPoint> markList = new ArrayList<>();
}
