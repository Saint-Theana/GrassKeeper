package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarCardChangeReq {
    public enum AvatarCardChangeReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=628) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=11) public Integer itemId = null;
    @Tag(tag=1) public Long avatarGuid = null;
    @Tag(tag=6) public Integer count = null;
}
