package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SetFriendRemarkNameReq {
    public enum SetFriendRemarkNameReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4094) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=11) public Integer uid = null;
    @Tag(tag=15) public String remarkName = null;
}
