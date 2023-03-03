package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SceneAreaWeatherNotify {
    public static class MapWeatherValueMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public String value = null;
    }

    @Tag(tag=1) public Integer weatherAreaId = null;
    @Tag(tag=9) public Integer weatherGadgetId = null;
    @Tag(tag=14) public Integer climateType = null;
    @Tag(tag=15,isFloat=true) public Float transDuration = null;
    @Tag(tag=10) public List<MapWeatherValueMap> weatherValueMap = new ArrayList<>();
}
