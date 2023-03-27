package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarFetterLevelRewardRsp {
    public enum AvatarFetterLevelRewardRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1612) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public Integer rewardId = null;
    @Tag(tag=14,isSigned=true) public Integer retcode = null;
    @Tag(tag=2) public Integer fetterLevel = null;
    @Tag(tag=6) public Long avatarGuid = null;
}
