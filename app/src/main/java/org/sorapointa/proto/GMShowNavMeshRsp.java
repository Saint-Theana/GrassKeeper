package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PBNavMeshTile.*;
import org.sorapointa.proto.PBNavMeshTile;

public class GMShowNavMeshRsp {
    public enum GMShowNavMeshRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2354) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public List<PBNavMeshTile> tiles = new ArrayList<>();
    @Tag(tag=4,isSigned=true) public Integer retcode = null;
}
