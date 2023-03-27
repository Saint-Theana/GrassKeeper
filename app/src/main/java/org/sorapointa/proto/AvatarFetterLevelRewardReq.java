package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarFetterLevelRewardReq {
    public enum AvatarFetterLevelRewardReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1682) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=13) public Long avatarGuid = null;
    @Tag(tag=12) public Integer fetterLevel = null;
}
