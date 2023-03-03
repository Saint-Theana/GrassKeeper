package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CityInfo.*;
import org.sorapointa.proto.CityInfo;

public class LevelupCityRsp {
    @Tag(tag=9) public Integer areaId = null;
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
    @Tag(tag=4) public Integer sceneId = null;
    @Tag(tag=6) public CityInfo cityInfo = null;
}
