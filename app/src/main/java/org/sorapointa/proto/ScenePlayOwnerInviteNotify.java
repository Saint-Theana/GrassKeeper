package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ScenePlayOwnerInviteNotify {
    @Tag(tag=14) public Integer inviteCd = null;
    @Tag(tag=5) public Integer playId = null;
    @Tag(tag=15) public Boolean isRemainReward = null;
}
