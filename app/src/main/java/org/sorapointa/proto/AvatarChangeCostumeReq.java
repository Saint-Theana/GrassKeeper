package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarChangeCostumeReq {
    public enum AvatarChangeCostumeReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1759) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=4) public Long avatarGuid = null;
    @Tag(tag=11) public Integer costumeId = null;
}
