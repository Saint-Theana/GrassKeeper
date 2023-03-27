package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ScenePlayOwnerInviteNotify {
    public enum ScenePlayOwnerInviteNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4424) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public Boolean isRemainReward = null;
    @Tag(tag=3) public Integer inviteCd = null;
    @Tag(tag=10) public Integer playId = null;
}
