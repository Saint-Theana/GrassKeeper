package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DeleteFriendRsp {
    public enum DeleteFriendRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4029) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11) public Integer targetUid = null;
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
}
