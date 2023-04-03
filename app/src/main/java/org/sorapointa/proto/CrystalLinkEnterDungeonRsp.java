package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CrystalLinkTeamInfo.*;
import org.sorapointa.proto.CrystalLinkTeamInfo;

public class CrystalLinkEnterDungeonRsp {
    public enum CrystalLinkEnterDungeonRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8936) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11) public Integer levelId = null;
    @Tag(tag=2) public Integer difficultyId = null;
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
    @Tag(tag=10) public List<CrystalLinkTeamInfo> teamInfoList = new ArrayList<>();
}
