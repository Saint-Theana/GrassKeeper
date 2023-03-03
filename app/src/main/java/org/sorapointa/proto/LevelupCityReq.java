package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class LevelupCityReq {
    @Tag(tag=5) public Integer sceneId = null;
    @Tag(tag=3) public Integer areaId = null;
    @Tag(tag=14) public Integer itemNum = null;
}
