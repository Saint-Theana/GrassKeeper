package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.InBattleMechanicusBuildingInfo.*;
import org.sorapointa.proto.InBattleMechanicusBuildingInfo;

public class InBattleMechanicusPlayerInfo {
    @Tag(tag=12) public List<InBattleMechanicusBuildingInfo> buildingList = new ArrayList<>();
    @Tag(tag=6) public Integer uid = null;
    @Tag(tag=15) public Integer pickCardId = null;
    @Tag(tag=9) public Boolean isCardConfirmed = null;
    @Tag(tag=3) public Integer buildingPoints = null;
}
