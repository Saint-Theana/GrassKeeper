package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ActivityWatcherInfo {
    @Tag(tag=8) public Integer curProgress = null;
    @Tag(tag=12) public Boolean isTakenReward = null;
    @Tag(tag=1) public Integer totalProgress = null;
    @Tag(tag=10) public Integer watcherId = null;
}
