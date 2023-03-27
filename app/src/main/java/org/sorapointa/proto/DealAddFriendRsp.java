package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DealAddFriendRsp {
    public enum DealAddFriendRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4070) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=2) public Integer dealAddFriendResult = null;
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
    @Tag(tag=4) public Integer targetUid = null;
}
