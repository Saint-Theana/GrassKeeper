package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MatchReason.*;
import org.sorapointa.proto.MatchReason;

public class PlayerMatchStopNotify {
    public enum PlayerMatchStopNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4193) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public Integer hostUid = null;
    @Tag(tag=9) public Integer reason = null;
}
