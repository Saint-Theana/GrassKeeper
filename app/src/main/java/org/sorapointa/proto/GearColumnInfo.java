package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GearColumnInfo {
    @Tag(tag=9) public Boolean hasGear = null;
    @Tag(tag=6) public Integer gearId = null;
    @Tag(tag=8) public Boolean isOverturn = null;
    @Tag(tag=11) public Integer placementLayer = null;
    @Tag(tag=15) public Integer gearColumnIndex = null;
}
