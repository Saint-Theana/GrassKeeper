package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.RogueAvatarInfo.*;
import org.sorapointa.proto.RogueAvatarInfo;

public class RogueShowAvatarTeamInfo {
    @Tag(tag=3) public List<RogueAvatarInfo> avatarList = new ArrayList<>();
}
