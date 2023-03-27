package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PersistentDungeonSwitchAvatarRsp {
    public enum PersistentDungeonSwitchAvatarRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1774) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public Long curAvatarGuid = null;
    @Tag(tag=13) public List<Long> avatarTeamGuidList = new ArrayList<>();
    @Tag(tag=4,isSigned=true) public Integer retcode = null;
}
