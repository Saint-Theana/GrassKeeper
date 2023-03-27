package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarWearFlycloakReq {
    public enum AvatarWearFlycloakReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1773) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=13) public Long avatarGuid = null;
    @Tag(tag=14) public Integer flycloakId = null;
}
