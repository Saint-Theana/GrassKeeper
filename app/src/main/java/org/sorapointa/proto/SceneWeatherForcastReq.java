package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SceneWeatherForcastReq {
    public enum SceneWeatherForcastReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3406) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=1) public Integer weatherAreaId = null;
}
