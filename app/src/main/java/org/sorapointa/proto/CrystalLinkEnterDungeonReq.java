package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CrystalLinkTeamInfo.*;
import org.sorapointa.proto.CrystalLinkTeamInfo;

public class CrystalLinkEnterDungeonReq {
    @Tag(tag=7) public Integer levelId = null;
    @Tag(tag=13) public List<CrystalLinkTeamInfo> teamInfoList = new ArrayList<>();
    @Tag(tag=10) public Integer difficultyId = null;
}
