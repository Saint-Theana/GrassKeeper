package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CoopCg.*;
import org.sorapointa.proto.CoopCg;
import org.sorapointa.proto.CoopPoint.*;
import org.sorapointa.proto.CoopPoint;
import org.sorapointa.proto.CoopReward.*;
import org.sorapointa.proto.CoopReward;

public class CoopChapter {
    public static class MapSeenEndingMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public enum State {
        @Tag(tag=0) STATE_CLOSE ,
        @Tag(tag=1) STATE_COND_NOT_MEET ,
        @Tag(tag=2) STATE_COND_MEET ,
        @Tag(tag=3) STATE_ACCEPT ;
    }

    @Tag(tag=1) public List<CoopCg> coopCgList = new ArrayList<>();
    @Tag(tag=2) public Integer id = null;
    @Tag(tag=11) public List<CoopPoint> coopPointList = new ArrayList<>();
    @Tag(tag=10) public List<Integer> finishDialogList = new ArrayList<>();
    @Tag(tag=14) public Integer finishedEndCount = null;
    @Tag(tag=7) public Integer totalEndCount = null;
    @Tag(tag=5) public List<CoopReward> coopRewardList = new ArrayList<>();
    @Tag(tag=12) public List<Integer> lockReasonList = new ArrayList<>();
    @Tag(tag=4) public State state = null;
    @Tag(tag=9) public List<MapSeenEndingMap> seenEndingMap = new ArrayList<>();
}
