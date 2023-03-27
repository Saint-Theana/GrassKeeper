package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PrivateChatReq {
    public enum PrivateChatReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4955) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=11) public Integer targetUid = null;
    @Tag(tag=15) public String text = null;
    @Tag(tag=9) public Integer icon = null;
}
