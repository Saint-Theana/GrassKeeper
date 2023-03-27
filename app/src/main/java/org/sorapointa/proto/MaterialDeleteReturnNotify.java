package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MaterialDeleteReturnNotify {
    public static class MapReturnItemMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public static class MapDeleteMaterialMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public enum MaterialDeleteReturnNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=615) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public List<MapReturnItemMap> returnItemMap = new ArrayList<>();
    @Tag(tag=10) public List<MapDeleteMaterialMap> deleteMaterialMap = new ArrayList<>();
    @Tag(tag=11) public Integer type = null;
}
