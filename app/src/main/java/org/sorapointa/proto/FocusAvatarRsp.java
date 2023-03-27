package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FocusAvatarRsp {
    public enum FocusAvatarRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1779) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11) public Boolean isFocus = null;
    @Tag(tag=1,isSigned=true) public Integer retcode = null;
    @Tag(tag=15) public Long avatarGuid = null;
}
