package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MapInfo {
    @Tag(tag=1,isSigned=true) public Integer minx = null;
    @Tag(tag=2,isSigned=true) public Integer maxx = null;
    @Tag(tag=3,isSigned=true) public Integer minz = null;
    @Tag(tag=4,isSigned=true) public Integer maxz = null;
    @Tag(tag=5) public List<CellInfo> cells = new ArrayList<>();
}
