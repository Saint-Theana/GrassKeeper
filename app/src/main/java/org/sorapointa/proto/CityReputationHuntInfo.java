package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CityReputationHuntInfo {
    @Tag(tag=6) public Boolean isOpen = null;
    @Tag(tag=15) public Integer curWeekFinishNum = null;
    @Tag(tag=5) public Boolean hasReward = null;
}
