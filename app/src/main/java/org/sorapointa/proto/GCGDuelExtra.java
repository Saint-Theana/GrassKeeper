package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGChallengeData.*;
import org.sorapointa.proto.GCGChallengeData;

public class GCGDuelExtra {
    public static class MapCardFaceMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=1) public List<Integer> cardIdList = new ArrayList<>();
    @Tag(tag=2) public Integer fieldId = null;
    @Tag(tag=3) public Integer cardBackId = null;
    @Tag(tag=4) public List<MapCardFaceMap> cardFaceMap = new ArrayList<>();
    @Tag(tag=5) public List<GCGChallengeData> challengeList = new ArrayList<>();
    @Tag(tag=6) public Integer score = null;
}
