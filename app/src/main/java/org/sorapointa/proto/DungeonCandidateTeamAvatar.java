package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AvatarInfo.*;
import org.sorapointa.proto.AvatarInfo;

public class DungeonCandidateTeamAvatar {
    @Tag(tag=2) public Integer playerUid = null;
    @Tag(tag=6) public AvatarInfo avatarInfo = null;
}
