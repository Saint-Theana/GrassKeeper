package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CrystalLinkEnterDungeonReq {
    public enum CrystalLinkEnterDungeonReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8110) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=7) public List<CrystalLinkTeamInfo> teamInfoList = new ArrayList<>();
    @Tag(tag=8) public Integer levelId = null;
    @Tag(tag=4) public Integer difficultyId = null;
}
