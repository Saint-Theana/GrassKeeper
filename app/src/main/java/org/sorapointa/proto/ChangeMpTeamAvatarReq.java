package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChangeMpTeamAvatarReq {
    public enum ChangeMpTeamAvatarReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1784) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=8) public Long curAvatarGuid = null;
    @Tag(tag=2) public List<Long> avatarGuidList = new ArrayList<>();
}
