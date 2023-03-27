package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DailyTaskInfo {
    @Tag(tag=9) public Integer finishProgress = null;
    @Tag(tag=3) public Boolean isFinished = null;
    @Tag(tag=7) public Integer progress = null;
    @Tag(tag=5) public Integer dailyTaskId = null;
    @Tag(tag=14) public Integer rewardId = null;
}
