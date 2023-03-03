package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Uint32Pair.*;
import org.sorapointa.proto.Uint32Pair;

public class MechanicusInfo {
    @Tag(tag=14) public List<Uint32Pair> gearLevelPairList = new ArrayList<>();
    @Tag(tag=7) public List<Integer> openSequenceIdList = new ArrayList<>();
    @Tag(tag=8) public Integer coin = null;
    @Tag(tag=12) public Integer punishOverTime = null;
    @Tag(tag=10) public Integer mechanicusId = null;
    @Tag(tag=13) public List<Integer> finishDifficultLevelList = new ArrayList<>();
    @Tag(tag=4) public Boolean isFinishTeachDungeon = null;
}
