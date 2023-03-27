package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HideAndSeekSelectAvatarRsp {
    public enum HideAndSeekSelectAvatarRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5364) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10) public Integer avatarId = null;
    @Tag(tag=14,isSigned=true) public Integer retcode = null;
}
