package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TakePlayerLevelRewardRsp {
    @Tag(tag=9) public Integer rewardId = null;
    @Tag(tag=13,isSigned=true) public Integer retcode = null;
    @Tag(tag=6) public Integer level = null;
}
