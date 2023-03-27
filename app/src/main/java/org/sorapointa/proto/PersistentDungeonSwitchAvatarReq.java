package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PersistentDungeonSwitchAvatarReq {
    public enum PersistentDungeonSwitchAvatarReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1709) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=14) public Long curAvatarGuid = null;
    @Tag(tag=2) public List<Long> avatarTeamGuidList = new ArrayList<>();
}
