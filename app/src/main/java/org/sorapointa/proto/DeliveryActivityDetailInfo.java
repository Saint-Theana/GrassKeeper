package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DeliveryActivityDetailInfo {
    @Tag(tag=14) public Integer dayIndex = null;
    @Tag(tag=13) public Boolean isTakenReward = null;
    @Tag(tag=4) public List<Integer> finishedDeliveryQuestIndex = new ArrayList<>();
}
