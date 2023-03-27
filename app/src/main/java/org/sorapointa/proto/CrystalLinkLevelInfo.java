package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CrystalLinkLevelInfo {
    @Tag(tag=3) public Integer levelId = null;
    @Tag(tag=6) public Integer bestScore = null;
    @Tag(tag=7) public Boolean isOpen = null;
    @Tag(tag=8) public List<CrystalLinkTeamInfo> teamInfoList = new ArrayList<>();
}
