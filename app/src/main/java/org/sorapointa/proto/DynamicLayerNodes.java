package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.DynamicSVONode.*;
import org.sorapointa.proto.DynamicSVONode;

public class DynamicLayerNodes {
    @Tag(tag=10,isSigned=true) public Integer level = null;
    @Tag(tag=6) public List<DynamicSVONode> nodes = new ArrayList<>();
}
