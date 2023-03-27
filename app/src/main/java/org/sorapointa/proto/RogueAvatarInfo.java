package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RogueAvatarInfo {
    @Tag(tag=15) public Integer avatarId = null;
    @Tag(tag=5) public Boolean isAlive = null;
    @Tag(tag=1) public Boolean isOnstage = null;
}
