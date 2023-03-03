package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TakeCoopRewardRsp {
    @Tag(tag=9,isSigned=true) public Integer retcode = null;
    @Tag(tag=1) public Integer rewardConfigId = null;
}
