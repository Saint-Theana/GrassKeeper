package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MpPlayOwnerStartInviteReq {
    public enum MpPlayOwnerStartInviteReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1815) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=13) public Boolean isSkipMatch = null;
    @Tag(tag=10) public Integer mpPlayId = null;
}
