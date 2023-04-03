package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MatchReason.*;
import org.sorapointa.proto.MatchReason;

public class PlayerGeneralMatchDismissNotify {
    public enum PlayerGeneralMatchDismissNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4187) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=6) public Integer matchId = null;
    @Tag(tag=13) public Integer reason = null;
    @Tag(tag=5) public List<Integer> uidList = new ArrayList<>();
}
