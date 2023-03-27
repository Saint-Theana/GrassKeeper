package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TowerCurLevelRecord {
    @Tag(tag=13) public List<TowerTeam> towerTeamList = new ArrayList<>();
    @Tag(tag=14) public Integer curLevelIndex = null;
    @Tag(tag=12) public List<Integer> buffIdList = new ArrayList<>();
    @Tag(tag=1) public Boolean isUpperPart = null;
    @Tag(tag=7) public Boolean isEmpty = null;
    @Tag(tag=9) public Integer curFloorId = null;
}
