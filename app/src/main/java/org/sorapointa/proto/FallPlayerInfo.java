package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FallPlayerInfo {
    public static class MapBallCatchCountMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=10) public Integer timeCost = null;
    @Tag(tag=4) public Integer uid = null;
    @Tag(tag=8) public List<MapBallCatchCountMap> ballCatchCountMap = new ArrayList<>();
    @Tag(tag=11) public Integer curScore = null;
    @Tag(tag=15) public Boolean isGround = null;
}
