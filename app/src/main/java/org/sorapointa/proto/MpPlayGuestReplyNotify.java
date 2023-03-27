package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MpPlayGuestReplyNotify {
    public enum MpPlayGuestReplyNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1812) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public Boolean isAgree = null;
    @Tag(tag=12) public Integer mpPlayId = null;
    @Tag(tag=6) public Integer uid = null;
}
