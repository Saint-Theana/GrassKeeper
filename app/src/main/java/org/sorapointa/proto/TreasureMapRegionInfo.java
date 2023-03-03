package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class TreasureMapRegionInfo {
    @Tag(tag=6) public Integer startTime = null;
    @Tag(tag=11) public Integer currentProgress = null;
    @Tag(tag=3) public Boolean isDoneMpSpot = null;
    @Tag(tag=2) public Integer sceneId = null;
    @Tag(tag=12) public Integer goalPoints = null;
    @Tag(tag=4) public Boolean isFindMpSpot = null;
    @Tag(tag=1) public Integer regionRadius = null;
    @Tag(tag=9) public Vector regionCenterPos = null;
    @Tag(tag=5) public Integer regionId = null;
}
