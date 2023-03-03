package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeFurnitureData.*;
import org.sorapointa.proto.HomeFurnitureData;

public class HomeFurnitureGroupData {
    @Tag(tag=8) public Integer groupFurnitureIndex = null;
    @Tag(tag=3) public List<HomeFurnitureData> virtualFurnitureList = new ArrayList<>();
}
