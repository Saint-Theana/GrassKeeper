package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TreasureMapDetectorData {
    @Tag(tag=15) public List<Vector> spotList = new ArrayList<>();
    @Tag(tag=6) public Integer regionId = null;
    @Tag(tag=7) public Integer radius = null;
    @Tag(tag=8) public Vector centerPos = null;
    @Tag(tag=12) public Boolean isRegionDetected = null;
}
