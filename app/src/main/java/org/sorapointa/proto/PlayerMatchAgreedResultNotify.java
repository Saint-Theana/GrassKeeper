package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PlayerMatchAgreedResultNotify_Reason.*;
import org.sorapointa.proto.PlayerMatchAgreedResultNotify_Reason;
import org.sorapointa.proto.MatchType.*;
import org.sorapointa.proto.MatchType;

public class PlayerMatchAgreedResultNotify {
    public enum PlayerMatchAgreedResultNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4152) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5) public Integer reason = null;
    @Tag(tag=12) public Integer matchType = null;
    @Tag(tag=7) public Integer targetUid = null;
}
