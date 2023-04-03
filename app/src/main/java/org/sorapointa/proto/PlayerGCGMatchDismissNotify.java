package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MatchReason.*;
import org.sorapointa.proto.MatchReason;

public class PlayerGCGMatchDismissNotify {
    public enum GPKMBGCPIIA {
        @Tag(tag=0) None ,
        @Tag(tag=4153) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8) public Integer reason = null;
    @Tag(tag=7) public List<Integer> uidList = new ArrayList<>();
    @Tag(tag=3) public Integer matchId = null;
}
