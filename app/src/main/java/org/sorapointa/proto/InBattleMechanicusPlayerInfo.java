package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.InBattleMechanicusBuildingInfo.*;
import org.sorapointa.proto.InBattleMechanicusBuildingInfo;

public class InBattleMechanicusPlayerInfo {
    @Tag(tag=5) public Integer pickCardId = null;
    @Tag(tag=14) public Integer uid = null;
    @Tag(tag=4) public List<InBattleMechanicusBuildingInfo> buildingList = new ArrayList<>();
    @Tag(tag=13) public Boolean isCardConfirmed = null;
    @Tag(tag=3) public Integer buildingPoints = null;
}
