package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerOfferingData {
    @Tag(tag=1) public Integer offeringId = null;
    @Tag(tag=15) public Boolean isFirstInteract = null;
    @Tag(tag=12) public Integer level = null;
    @Tag(tag=8) public List<Integer> takenLevelRewardList = new ArrayList<>();
    @Tag(tag=6) public Boolean isNewMaxLevel = null;
}
