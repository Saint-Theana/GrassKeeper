package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class TreasureMapDetectorData {
    @Tag(tag=4) public Integer regionId = null;
    @Tag(tag=7) public Vector centerPos = null;
    @Tag(tag=6) public Boolean isRegionDetected = null;
    @Tag(tag=10) public List<Vector> spotList = new ArrayList<>();
    @Tag(tag=14) public Integer radius = null;
}
