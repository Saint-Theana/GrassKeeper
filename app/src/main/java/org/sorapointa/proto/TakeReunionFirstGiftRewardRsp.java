package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TakeReunionFirstGiftRewardRsp {
    @Tag(tag=9,isSigned=true) public Integer rewardId = null;
    @Tag(tag=15,isSigned=true) public Integer retcode = null;
}
