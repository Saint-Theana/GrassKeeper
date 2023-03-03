package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.WeeklyBossResinDiscountInfo.*;
import org.sorapointa.proto.WeeklyBossResinDiscountInfo;

public class BossChestInfo {
    public static class MapUidDiscountMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public WeeklyBossResinDiscountInfo value = null;
    }

    @Tag(tag=1) public Integer monsterConfigId = null;
    @Tag(tag=2) public Integer resin = null;
    @Tag(tag=3) public List<Integer> remainUidList = new ArrayList<>();
    @Tag(tag=4) public List<Integer> qualifyUidList = new ArrayList<>();
    @Tag(tag=5) public List<MapUidDiscountMap> uidDiscountMap = new ArrayList<>();
}
