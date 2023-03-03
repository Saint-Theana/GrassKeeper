package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RogueAvatarInfo {
    @Tag(tag=5) public Boolean isOnstage = null;
    @Tag(tag=3) public Boolean isAlive = null;
    @Tag(tag=14) public Integer avatarId = null;
}
