package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PBNavMeshPoly {
    @Tag(tag=1) public List<Integer> edgeTypes = new ArrayList<>();
    @Tag(tag=5,isSigned=true) public Integer area = null;
    @Tag(tag=14,isSigned=true) public List<Integer> vects = new ArrayList<>();
}
