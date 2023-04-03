package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.DynamicSVONode.*;
import org.sorapointa.proto.DynamicSVONode;

public class DynamicLayerNodes {
    @Tag(tag=8) public List<DynamicSVONode> nodes = new ArrayList<>();
    @Tag(tag=12,isSigned=true) public Integer level = null;
}
