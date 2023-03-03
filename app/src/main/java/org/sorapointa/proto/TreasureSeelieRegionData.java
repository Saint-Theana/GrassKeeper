package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class TreasureSeelieRegionData {
    @Tag(tag=12) public Boolean isDone = null;
    @Tag(tag=6) public Integer openDay = null;
    @Tag(tag=10) public Integer openedChestNum = null;
    @Tag(tag=7,isFloat=true) public Float regionRadius = null;
    @Tag(tag=9) public Boolean isOpen = null;
    @Tag(tag=8) public Integer openTime = null;
    @Tag(tag=11) public Vector regionCenterPos = null;
    @Tag(tag=13) public Integer sceneId = null;
    @Tag(tag=15) public Integer totalChestNum = null;
    @Tag(tag=1) public Integer regionId = null;
}
