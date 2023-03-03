package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SceneWeatherForecastRsp {
    @Tag(tag=14) public Long nextClimateTime = null;
    @Tag(tag=2) public List<Integer> forcastClimateList = new ArrayList<>();
    @Tag(tag=4,isSigned=true) public Integer retcode = null;
}
