package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ReunionMissionInfo.*;
import org.sorapointa.proto.ReunionMissionInfo;

public class TakeReunionMissionRewardRsp {
    @Tag(tag=12) public Integer rewardIndex = null;
    @Tag(tag=2,isSigned=true) public Integer retcode = null;
    @Tag(tag=9) public ReunionMissionInfo missionInfo = null;
    @Tag(tag=3) public Integer rewardId = null;
}
