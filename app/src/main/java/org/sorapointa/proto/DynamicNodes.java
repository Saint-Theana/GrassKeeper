package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.DynamicLayerNodes.*;
import org.sorapointa.proto.DynamicLayerNodes;

public class DynamicNodes {
    @Tag(tag=8) public List<DynamicLayerNodes> nodes = new ArrayList<>();
}
