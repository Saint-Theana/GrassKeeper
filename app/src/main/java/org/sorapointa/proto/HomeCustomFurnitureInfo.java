package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CustomCommonNodeInfo.*;
import org.sorapointa.proto.CustomCommonNodeInfo;

public class HomeCustomFurnitureInfo {
    @Tag(tag=12) public List<CustomCommonNodeInfo> subFurnitureList = new ArrayList<>();
    @Tag(tag=6) public Integer guid = null;
}
