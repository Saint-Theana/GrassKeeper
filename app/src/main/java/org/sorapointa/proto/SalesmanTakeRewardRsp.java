package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SalesmanTakeRewardRsp {
    @Tag(tag=13) public Integer position = null;
    @Tag(tag=7) public Integer scheduleId = null;
    @Tag(tag=9) public Integer rewardId = null;
    @Tag(tag=11,isSigned=true) public Integer retcode = null;
}
