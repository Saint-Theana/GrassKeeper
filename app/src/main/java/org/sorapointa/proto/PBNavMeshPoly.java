package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PBNavMeshPoly {
    public enum EdgeType {
        @Tag(tag=0) EDGE_TYPE_INNER ,
        @Tag(tag=1) EDGE_TYPE_TILE_BOUND ,
        @Tag(tag=2) EDGE_TYPE_TILE_BOUND_UNCONNECT ,
        @Tag(tag=3) EDGE_TYPE_TILE_BOUND_OVERIDE ;
    }

    @Tag(tag=10) public List<EdgeType> edgeTypes = new ArrayList<>();
    @Tag(tag=6,isSigned=true) public Integer area = null;
    @Tag(tag=7,isSigned=true) public List<Integer> vects = new ArrayList<>();
}
