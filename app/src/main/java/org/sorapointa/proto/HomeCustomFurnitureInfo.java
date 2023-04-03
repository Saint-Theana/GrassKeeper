package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CustomCommonNodeInfo.*;
import org.sorapointa.proto.CustomCommonNodeInfo;

public class HomeCustomFurnitureInfo {
    @Tag(tag=8) public Integer guid = null;
    @Tag(tag=5) public List<CustomCommonNodeInfo> subFurnitureList = new ArrayList<>();
}
