package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ReunionSignInInfo {
    @Tag(tag=9) public Integer lastSignInTime = null;
    @Tag(tag=13) public Integer configId = null;
    @Tag(tag=5) public List<Integer> rewardDayList = new ArrayList<>();
    @Tag(tag=14) public Integer signInCount = null;
}
