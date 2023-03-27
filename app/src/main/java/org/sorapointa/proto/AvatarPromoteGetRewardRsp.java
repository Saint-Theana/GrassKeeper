package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarPromoteGetRewardRsp {
    public enum AvatarPromoteGetRewardRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1718) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8) public Integer rewardId = null;
    @Tag(tag=5) public Integer promoteLevel = null;
    @Tag(tag=12,isSigned=true) public Integer retcode = null;
    @Tag(tag=14) public Long avatarGuid = null;
}
