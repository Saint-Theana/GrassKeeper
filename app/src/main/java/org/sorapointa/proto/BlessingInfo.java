package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BlessingInfo {
    public static class MapPicNumMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=5) public Boolean isContentClosed = null;
    @Tag(tag=11) public Integer contentCloseTime = null;
    @Tag(tag=12) public Integer curDayScanNum = null;
    @Tag(tag=15) public Integer curDayScanType = null;
    @Tag(tag=9) public Integer redeemRewardNum = null;
    @Tag(tag=7) public List<MapPicNumMap> picNumMap = new ArrayList<>();
    @Tag(tag=14) public Integer nextRefreshTime = null;
    @Tag(tag=8) public Boolean isActivated = null;
}
