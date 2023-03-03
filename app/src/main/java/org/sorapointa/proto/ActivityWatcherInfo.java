package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ActivityWatcherInfo {
    @Tag(tag=8) public Boolean isTakenReward = null;
    @Tag(tag=2) public Integer curProgress = null;
    @Tag(tag=4) public Integer totalProgress = null;
    @Tag(tag=5) public Integer watcherId = null;
}
