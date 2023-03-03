package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DailyTaskInfo {
    @Tag(tag=3) public Integer rewardId = null;
    @Tag(tag=13) public Integer progress = null;
    @Tag(tag=10) public Integer finishProgress = null;
    @Tag(tag=4) public Integer dailyTaskId = null;
    @Tag(tag=14) public Boolean isFinished = null;
}
