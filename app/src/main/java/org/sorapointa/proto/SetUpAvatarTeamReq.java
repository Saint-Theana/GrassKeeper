package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SetUpAvatarTeamReq {
    public enum SetUpAvatarTeamReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1764) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=9) public Long curAvatarGuid = null;
    @Tag(tag=4) public Integer teamId = null;
    @Tag(tag=15) public List<Long> avatarTeamGuidList = new ArrayList<>();
}
