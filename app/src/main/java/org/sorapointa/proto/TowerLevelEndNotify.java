package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class TowerLevelEndNotify {
    public enum TowerLevelEndNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2445) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public List<Integer> finishedStarCondList = new ArrayList<>();
    @Tag(tag=12) public Integer nextFloorId = null;
    @Tag(tag=15) public Boolean isSuccess = null;
    @Tag(tag=8) public List<ItemParam> rewardItemList = new ArrayList<>();
    @Tag(tag=6) public Integer continueState = null;
}
