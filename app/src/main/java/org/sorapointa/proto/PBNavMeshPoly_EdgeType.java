package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum PBNavMeshPoly_EdgeType {
        @Tag(tag=0) Inner ,
        @Tag(tag=1) TileBound ,
        @Tag(tag=2) TileBoundUnconnect ,
        @Tag(tag=3) TileBoundOveride ;
}
