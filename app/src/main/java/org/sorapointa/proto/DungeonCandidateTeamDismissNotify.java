package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.DungeonCandidateTeamPlayerDismissReason.*;
import org.sorapointa.proto.DungeonCandidateTeamPlayerDismissReason;

public class DungeonCandidateTeamDismissNotify {
    @Tag(tag=9) public Integer reason = null;
    @Tag(tag=12) public Integer playerUid = null;
}
