package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MatchReason.*;
import org.sorapointa.proto.MatchReason;

public class PlayerGCGMatchDismissNotify {
    @Tag(tag=11) public Integer matchId = null;
    @Tag(tag=5) public Integer reason = null;
    @Tag(tag=7) public List<Integer> uidList = new ArrayList<>();
}
