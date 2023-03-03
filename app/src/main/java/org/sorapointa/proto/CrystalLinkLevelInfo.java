package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CrystalLinkTeamInfo.*;
import org.sorapointa.proto.CrystalLinkTeamInfo;

public class CrystalLinkLevelInfo {
    @Tag(tag=10) public List<CrystalLinkTeamInfo> teamInfoList = new ArrayList<>();
    @Tag(tag=9) public Boolean isOpen = null;
    @Tag(tag=14) public Integer levelId = null;
    @Tag(tag=5) public Integer bestScore = null;
}
