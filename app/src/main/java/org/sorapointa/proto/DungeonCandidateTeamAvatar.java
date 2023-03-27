package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DungeonCandidateTeamAvatar {
    @Tag(tag=5) public Integer playerUid = null;
    @Tag(tag=8) public AvatarInfo avatarInfo = null;
}
