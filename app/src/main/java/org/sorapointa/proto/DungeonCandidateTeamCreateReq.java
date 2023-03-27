package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DungeonCandidateTeamCreateReq {
    public enum DungeonCandidateTeamCreateReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=945) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=8) public Integer dungeonId = null;
    @Tag(tag=12) public Integer pointId = null;
}
