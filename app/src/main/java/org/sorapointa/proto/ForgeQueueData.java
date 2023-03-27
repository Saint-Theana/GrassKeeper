package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ForgeQueueData {
    @Tag(tag=6) public Integer forgeId = null;
    @Tag(tag=1) public Integer finishCount = null;
    @Tag(tag=9) public Integer queueId = null;
    @Tag(tag=8) public Integer unfinishCount = null;
    @Tag(tag=11) public Integer totalFinishTimestamp = null;
    @Tag(tag=12) public Integer avatarId = null;
    @Tag(tag=2) public Integer nextFinishTimestamp = null;
}
