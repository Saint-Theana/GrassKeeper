package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SeaLampTakeContributionRewardRsp {
    @Tag(tag=9) public Integer configId = null;
    @Tag(tag=7,isSigned=true) public Integer retcode = null;
}
