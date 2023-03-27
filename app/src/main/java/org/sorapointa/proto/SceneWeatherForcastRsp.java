package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SceneWeatherForcastRsp {
    public enum SceneWeatherForcastRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3500) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public List<Integer> forcastClimateList = new ArrayList<>();
    @Tag(tag=10) public Long nextClimateTime = null;
    @Tag(tag=4,isSigned=true) public Integer retcode = null;
}
