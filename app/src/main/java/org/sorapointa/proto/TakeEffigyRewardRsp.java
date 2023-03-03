package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TakeEffigyRewardRsp {
    @Tag(tag=15,isSigned=true) public Integer retcode = null;
    @Tag(tag=7) public Integer rewardIndex = null;
}
