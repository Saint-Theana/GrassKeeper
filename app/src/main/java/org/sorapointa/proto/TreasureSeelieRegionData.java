package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TreasureSeelieRegionData {
    @Tag(tag=8) public Boolean isDone = null;
    @Tag(tag=9) public Integer totalChestNum = null;
    @Tag(tag=12,isFloat=true) public Float regionRadius = null;
    @Tag(tag=5) public Integer openTime = null;
    @Tag(tag=1) public Boolean isOpen = null;
    @Tag(tag=6) public Vector regionCenterPos = null;
    @Tag(tag=10) public Integer openedChestNum = null;
    @Tag(tag=4) public Integer sceneId = null;
    @Tag(tag=3) public Integer openDay = null;
    @Tag(tag=13) public Integer regionId = null;
}
