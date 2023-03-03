package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CrystalLinkTeamInfo.*;
import org.sorapointa.proto.CrystalLinkTeamInfo;

public class CrystalLinkEnterDungeonRsp {
    @Tag(tag=1) public Integer levelId = null;
    @Tag(tag=14) public Integer difficultyId = null;
    @Tag(tag=6,isSigned=true) public Integer retcode = null;
    @Tag(tag=8) public List<CrystalLinkTeamInfo> teamInfoList = new ArrayList<>();
}
