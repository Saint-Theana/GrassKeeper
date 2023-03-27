package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SceneAreaWeatherNotify {
    public static class MapWeatherValueMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public String value = null;
    }

    public enum SceneAreaWeatherNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=281) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10) public Integer climateType = null;
    @Tag(tag=5,isFloat=true) public Float transDuration = null;
    @Tag(tag=15) public Integer weatherGadgetId = null;
    @Tag(tag=7) public List<MapWeatherValueMap> weatherValueMap = new ArrayList<>();
    @Tag(tag=13) public Integer weatherAreaId = null;
}
