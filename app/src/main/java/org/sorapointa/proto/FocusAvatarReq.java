package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FocusAvatarReq {
    public enum FocusAvatarReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1608) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=15) public Boolean isFocus = null;
    @Tag(tag=10) public Long avatarGuid = null;
}
