package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MpPlayOwnerStartInviteRsp {
    public enum MpPlayOwnerStartInviteRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1803) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=3) public Integer mpPlayId = null;
    @Tag(tag=7) public Boolean isSkipMatch = null;
    @Tag(tag=8,isSigned=true) public Integer retcode = null;
}
