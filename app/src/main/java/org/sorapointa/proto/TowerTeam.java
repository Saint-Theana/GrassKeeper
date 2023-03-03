package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TowerTeam {
    @Tag(tag=3) public Integer towerTeamId = null;
    @Tag(tag=14) public List<Long> avatarGuidList = new ArrayList<>();
}
