package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.DungeonCandidateTeamPlayerLeaveReason.*;
import org.sorapointa.proto.DungeonCandidateTeamPlayerLeaveReason;

public class DungeonCandidateTeamPlayerLeaveNotify {
    @Tag(tag=3) public Integer reason = null;
    @Tag(tag=13) public Integer playerUid = null;
}
