package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MpPlayInviteResultNotify {
    public enum MpPlayInviteResultNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1824) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10) public Boolean allArgee = null;
    @Tag(tag=5) public Integer mpPlayId = null;
}
