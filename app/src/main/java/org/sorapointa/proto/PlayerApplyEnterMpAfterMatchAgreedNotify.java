package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerApplyEnterMpAfterMatchAgreedNotify {
    public enum PlayerApplyEnterMpAfterMatchAgreedNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4190) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public Integer matchserverId = null;
    @Tag(tag=8) public OnlinePlayerInfo srcPlayerInfo = null;
    @Tag(tag=2) public Integer matchType = null;
}
