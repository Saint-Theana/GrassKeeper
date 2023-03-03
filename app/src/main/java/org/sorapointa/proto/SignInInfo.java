package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SignInData.*;
import org.sorapointa.proto.SignInData;

public class SignInInfo {
    @Tag(tag=7) public Boolean isCondSatisfied = null;
    @Tag(tag=15) public List<Integer> rewardDayList = new ArrayList<>();
    @Tag(tag=12) public List<SignInData> signinDataList = new ArrayList<>();
    @Tag(tag=8) public Integer configId = null;
    @Tag(tag=2) public Integer signInCount = null;
    @Tag(tag=3) public Integer scheduleId = null;
    @Tag(tag=13) public Integer endTime = null;
    @Tag(tag=6) public Integer lastSignInTime = null;
    @Tag(tag=5) public Integer beginTime = null;
}
