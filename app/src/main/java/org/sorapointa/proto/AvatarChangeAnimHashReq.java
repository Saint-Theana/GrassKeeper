package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarChangeAnimHashReq {
    public enum AvatarChangeAnimHashReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1603) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=2) public Long avatarGuid = null;
    @Tag(tag=12) public Integer animHash = null;
}
