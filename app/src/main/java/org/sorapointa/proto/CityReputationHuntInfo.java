package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CityReputationHuntInfo {
    @Tag(tag=1) public Integer curWeekFinishNum = null;
    @Tag(tag=4) public Boolean hasReward = null;
    @Tag(tag=10) public Boolean isOpen = null;
}
