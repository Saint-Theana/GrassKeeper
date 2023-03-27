package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TowerTeam {
    @Tag(tag=4) public List<Long> avatarGuidList = new ArrayList<>();
    @Tag(tag=10) public Integer towerTeamId = null;
}
