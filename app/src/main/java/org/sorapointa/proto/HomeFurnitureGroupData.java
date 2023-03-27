package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeFurnitureGroupData {
    @Tag(tag=12) public List<HomeFurnitureData> virtualFurniureList = new ArrayList<>();
    @Tag(tag=4) public Integer groupFurnitureIndex = null;
}
