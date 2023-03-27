package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MechanicusInfo {
    @Tag(tag=14) public Integer mechanicusId = null;
    @Tag(tag=7) public List<Integer> finishDifficultLevelList = new ArrayList<>();
    @Tag(tag=6) public List<Uint32Pair> gearLevelPairList = new ArrayList<>();
    @Tag(tag=12) public List<Integer> openSequenceIdList = new ArrayList<>();
    @Tag(tag=3) public Boolean isFinishTeachDungeon = null;
    @Tag(tag=8) public Integer coin = null;
    @Tag(tag=10) public Integer punishOverTime = null;
}
