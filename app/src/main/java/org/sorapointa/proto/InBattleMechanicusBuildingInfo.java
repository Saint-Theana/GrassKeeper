package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class InBattleMechanicusBuildingInfo {
    @Tag(tag=6) public Integer buildingId = null;
    @Tag(tag=3) public Integer level = null;
    @Tag(tag=14) public Integer refundPoints = null;
    @Tag(tag=4) public Integer costPoints = null;
}
