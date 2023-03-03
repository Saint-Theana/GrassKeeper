package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WatcherEventTypeNotify {
    @Tag(tag=14) public List<Integer> paramList = new ArrayList<>();
    @Tag(tag=15) public Integer addProgress = null;
    @Tag(tag=11) public Integer watcherTriggerType = null;
}
