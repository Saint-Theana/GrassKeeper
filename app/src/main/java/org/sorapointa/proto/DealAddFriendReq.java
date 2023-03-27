package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DealAddFriendReq {
    public enum DealAddFriendReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4080) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=1) public Integer targetUid = null;
    @Tag(tag=6) public Integer dealAddFriendResult = null;
}
