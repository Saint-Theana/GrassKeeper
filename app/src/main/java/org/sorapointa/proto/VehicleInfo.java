package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class VehicleInfo {
    @Tag(tag=1) public List<VehicleMember> memberList = new ArrayList<>();
    @Tag(tag=2) public Integer ownerUid = null;
    @Tag(tag=3,isFloat=true) public Float curStamina = null;
}
