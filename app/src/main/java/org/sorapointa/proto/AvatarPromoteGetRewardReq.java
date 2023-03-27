package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarPromoteGetRewardReq {
    public enum AvatarPromoteGetRewardReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1642) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=8) public Long avatarGuid = null;
    @Tag(tag=10) public Integer promoteLevel = null;
}
