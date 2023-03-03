package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SetSceneWeatherAreaReq {
    public static class MapWeatherValueMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public String value = null;
    }

    @Tag(tag=13) public Integer weatherGadgetId = null;
    @Tag(tag=4) public List<MapWeatherValueMap> weatherValueMap = new ArrayList<>();
}
