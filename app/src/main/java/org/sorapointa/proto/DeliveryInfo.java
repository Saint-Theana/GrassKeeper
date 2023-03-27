package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DeliveryInfo {
    @Tag(tag=6) public Integer dayIndex = null;
    @Tag(tag=7) public List<Integer> finishedDeliveryQuestIndex = new ArrayList<>();
    @Tag(tag=4) public Boolean isTakenReward = null;
}
