package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CityReputationQuestInfo {
    @Tag(tag=14) public Boolean isOpen = null;
    @Tag(tag=4) public List<Integer> takenParentQuestRewardList = new ArrayList<>();
    @Tag(tag=10) public List<Integer> finishedParentQuestList = new ArrayList<>();
}
