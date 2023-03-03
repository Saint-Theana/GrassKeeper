package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MaterialDeleteReturnType.*;
import org.sorapointa.proto.MaterialDeleteReturnType;

public class MaterialDeleteReturnNotify {
    public static class MapReturnItemMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public static class MapDeleteMaterialMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=5) public List<MapReturnItemMap> returnItemMap = new ArrayList<>();
    @Tag(tag=8) public Integer type = null;
    @Tag(tag=6) public List<MapDeleteMaterialMap> deleteMaterialMap = new ArrayList<>();
}
