package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class VehicleLocationInfo {
    @Tag(tag=11) public List<Integer> uidList = new ArrayList<>();
    @Tag(tag=7) public Integer gadgetId = null;
    @Tag(tag=12) public Vector pos = null;
    @Tag(tag=2) public Integer entityId = null;
    @Tag(tag=14) public Vector rot = null;
    @Tag(tag=5,isFloat=true) public Float curHp = null;
    @Tag(tag=9) public Integer ownerUid = null;
    @Tag(tag=6,isFloat=true) public Float maxHp = null;
}
