package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class TreasureMapRegionInfo {
    @Tag(tag=5) public Integer currentProgress = null;
    @Tag(tag=12) public Integer goalPoints = null;
    @Tag(tag=6) public Integer startTime = null;
    @Tag(tag=1) public Integer sceneId = null;
    @Tag(tag=14) public Integer regionId = null;
    @Tag(tag=8) public Integer regionRadius = null;
    @Tag(tag=15) public Boolean isFindMpSpot = null;
    @Tag(tag=2) public Boolean isDoneMpSpot = null;
    @Tag(tag=13) public Vector regionCenterPos = null;
}
