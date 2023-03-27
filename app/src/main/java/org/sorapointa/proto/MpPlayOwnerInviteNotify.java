package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MpPlayOwnerInviteNotify {
    public enum MpPlayOwnerInviteNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1810) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=6) public Integer cd = null;
    @Tag(tag=9) public Boolean isRemainReward = null;
    @Tag(tag=3) public Integer mpPlayId = null;
}
