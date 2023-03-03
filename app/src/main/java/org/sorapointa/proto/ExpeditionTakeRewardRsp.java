package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ExpeditionTakeRewardRsp {
    @Tag(tag=13,isSigned=true) public Integer retcode = null;
    @Tag(tag=11) public Boolean isBonus = null;
    @Tag(tag=1) public Integer rewardLevel = null;
    @Tag(tag=9) public Integer pathId = null;
}
