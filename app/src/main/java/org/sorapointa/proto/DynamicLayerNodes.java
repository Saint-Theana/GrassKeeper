package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DynamicLayerNodes {
    @Tag(tag=8) public List<DynamicSVONode> nodes = new ArrayList<>();
    @Tag(tag=12,isSigned=true) public Integer level = null;
}
