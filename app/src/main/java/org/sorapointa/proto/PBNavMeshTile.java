package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PBNavMeshPoly.*;
import org.sorapointa.proto.PBNavMeshPoly;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class PBNavMeshTile {
    @Tag(tag=11) public List<PBNavMeshPoly> polys = new ArrayList<>();
    @Tag(tag=1) public List<Vector> vecs = new ArrayList<>();
}
