package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MatchReason.*;
import org.sorapointa.proto.MatchReason;

public class PlayerGeneralMatchDismissNotify {
    @Tag(tag=3) public List<Integer> uidList = new ArrayList<>();
    @Tag(tag=13) public Integer reason = null;
    @Tag(tag=1) public Integer matchId = null;
}
