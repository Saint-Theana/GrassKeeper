package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DungeonCandidateTeamInviteNotify {
    @Tag(tag=5) public Integer playerUid = null;
    @Tag(tag=9) public Integer vaildDeadlineTimeSec = null;
    @Tag(tag=6) public Integer dungeonId = null;
}
