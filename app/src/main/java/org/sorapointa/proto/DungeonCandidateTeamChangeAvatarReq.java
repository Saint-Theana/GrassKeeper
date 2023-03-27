package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DungeonCandidateTeamChangeAvatarReq {
    public enum DungeonCandidateTeamChangeAvatarReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=936) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=5) public List<Long> avatarGuidList = new ArrayList<>();
}
