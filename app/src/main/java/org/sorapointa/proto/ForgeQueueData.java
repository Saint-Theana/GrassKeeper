package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ForgeQueueData {
    @Tag(tag=13) public Integer finishCount = null;
    @Tag(tag=14) public Integer totalFinishTimestamp = null;
    @Tag(tag=7) public Integer avatarId = null;
    @Tag(tag=1) public Integer queueId = null;
    @Tag(tag=10) public Integer unfinishCount = null;
    @Tag(tag=11) public Integer nextFinishTimestamp = null;
    @Tag(tag=15) public Integer forgeId = null;
}
