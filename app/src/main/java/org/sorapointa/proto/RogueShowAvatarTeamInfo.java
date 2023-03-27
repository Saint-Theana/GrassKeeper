package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RogueShowAvatarTeamInfo {
    @Tag(tag=3) public List<RogueAvatarInfo> avatarList = new ArrayList<>();
}
