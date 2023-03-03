package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CityReputationQuestInfo {
    @Tag(tag=2) public Boolean isOpen = null;
    @Tag(tag=12) public List<Integer> takenParentQuestRewardList = new ArrayList<>();
    @Tag(tag=7) public List<Integer> finishedParentQuestList = new ArrayList<>();
}
