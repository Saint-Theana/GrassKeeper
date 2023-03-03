package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class TowerLevelEndNotify {
    public enum ContinueStateType {
        @Tag(tag=0) CONTINUE_STATE_TYPE_CAN_NOT_CONTINUE ,
        @Tag(tag=1) CONTINUE_STATE_TYPE_CAN_ENTER_NEXT_LEVEL ,
        @Tag(tag=2) CONTINUE_STATE_TYPE_CAN_ENTER_NEXT_FLOOR ;
    }

    @Tag(tag=4) public Integer nextFloorId = null;
    @Tag(tag=12) public List<ItemParam> rewardItemList = new ArrayList<>();
    @Tag(tag=15) public Integer continueState = null;
    @Tag(tag=5) public Boolean isSuccess = null;
    @Tag(tag=6) public List<Integer> finishedStarCondList = new ArrayList<>();
}
