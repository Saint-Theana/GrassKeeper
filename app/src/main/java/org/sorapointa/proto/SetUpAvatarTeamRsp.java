package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SetUpAvatarTeamRsp {
    public enum SetUpAvatarTeamRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1745) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5) public Integer teamId = null;
    @Tag(tag=6) public List<Long> avatarTeamGuidList = new ArrayList<>();
    @Tag(tag=2) public Long curAvatarGuid = null;
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
}
