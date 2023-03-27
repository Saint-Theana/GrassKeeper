package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SetSceneWeatherAreaReq {
    public static class MapWeatherValueMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public String value = null;
    }

    public enum SetSceneWeatherAreaReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=208) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=15) public Integer weatherGadgetId = null;
    @Tag(tag=6) public List<MapWeatherValueMap> weatherValueMap = new ArrayList<>();
}
