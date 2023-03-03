package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FishtankFishInfo {
    @Tag(tag=1,isFloat=true) public Float fishDistanceFromWater = null;
    @Tag(tag=2,isFloat=true) public Float fishScale = null;
    @Tag(tag=3,isFloat=true) public Float initialRotationY = null;
}
