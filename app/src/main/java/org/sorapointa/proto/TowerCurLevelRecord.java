package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.TowerTeam.*;
import org.sorapointa.proto.TowerTeam;

public class TowerCurLevelRecord {
    @Tag(tag=8) public List<TowerTeam> towerTeamList = new ArrayList<>();
    @Tag(tag=6) public Boolean isEmpty = null;
    @Tag(tag=4) public List<Integer> buffIdList = new ArrayList<>();
    @Tag(tag=2) public Boolean isUpperPart = null;
    @Tag(tag=1) public Integer curLevelIndex = null;
    @Tag(tag=15) public Integer curFloorId = null;
}
