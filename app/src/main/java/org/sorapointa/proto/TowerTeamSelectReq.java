package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.TowerTeam.*;
import org.sorapointa.proto.TowerTeam;

public class TowerTeamSelectReq {
    @Tag(tag=11) public List<TowerTeam> towerTeamList = new ArrayList<>();
    @Tag(tag=10) public Integer floorId = null;
}
