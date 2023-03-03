package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PBNavMeshTile.*;
import org.sorapointa.proto.PBNavMeshTile;

public class GMShowNavMeshRsp {
    @Tag(tag=11) public List<PBNavMeshTile> tiles = new ArrayList<>();
    @Tag(tag=5,isSigned=true) public Integer retcode = null;
}
