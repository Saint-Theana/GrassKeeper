package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerOfferingData {
    @Tag(tag=11) public Boolean isNewMaxLevel = null;
    @Tag(tag=8) public Integer offeringId = null;
    @Tag(tag=4) public Boolean isFirstInteract = null;
    @Tag(tag=7) public List<Integer> takenLevelRewardList = new ArrayList<>();
    @Tag(tag=1) public Integer level = null;
}
