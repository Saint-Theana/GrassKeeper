package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ReunionSignInInfo {
    @Tag(tag=6) public Integer signInCount = null;
    @Tag(tag=8) public List<Integer> rewardDayList = new ArrayList<>();
    @Tag(tag=12) public Integer configId = null;
    @Tag(tag=11) public Integer lastSignInTime = null;
}
