package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChangeMpTeamAvatarRsp {
    public enum ChangeMpTeamAvatarRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1796) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12) public Long curAvatarGuid = null;
    @Tag(tag=10) public List<Long> avatarGuidList = new ArrayList<>();
    @Tag(tag=1,isSigned=true) public Integer retcode = null;
}
