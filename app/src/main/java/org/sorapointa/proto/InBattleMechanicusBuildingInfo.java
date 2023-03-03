package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class InBattleMechanicusBuildingInfo {
    @Tag(tag=8) public Integer buildingId = null;
    @Tag(tag=7) public Integer level = null;
    @Tag(tag=2) public Integer costPoints = null;
    @Tag(tag=11) public Integer refundPoints = null;
}
