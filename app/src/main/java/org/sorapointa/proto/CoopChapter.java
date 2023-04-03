package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CoopChapter_State.*;
import org.sorapointa.proto.CoopChapter_State;
import org.sorapointa.proto.CoopCg.*;
import org.sorapointa.proto.CoopCg;
import org.sorapointa.proto.CoopReward.*;
import org.sorapointa.proto.CoopReward;
import org.sorapointa.proto.CoopPoint.*;
import org.sorapointa.proto.CoopPoint;

public class CoopChapter {
    public static class MapSeenEndingMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=12) public List<MapSeenEndingMap> seenEndingMap = new ArrayList<>();
    @Tag(tag=5) public List<Integer> finishDialogList = new ArrayList<>();
    @Tag(tag=11) public List<CoopCg> coopCgList = new ArrayList<>();
    @Tag(tag=9) public List<CoopReward> coopRewardList = new ArrayList<>();
    @Tag(tag=4) public List<Integer> lockReasonList = new ArrayList<>();
    @Tag(tag=8) public Integer finishedEndCount = null;
    @Tag(tag=7) public List<CoopPoint> coopPointList = new ArrayList<>();
    @Tag(tag=15) public Integer state = null;
    @Tag(tag=6) public Integer id = null;
    @Tag(tag=14) public Integer totalEndCount = null;
}
