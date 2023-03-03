package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class LunaRiteTakeSacrificeRewardRsp {
    @Tag(tag=11) public Integer index = null;
    @Tag(tag=2) public List<Integer> sacrificeRewardList = new ArrayList<>();
    @Tag(tag=14) public Integer sacrificeRewardIndex = null;
    @Tag(tag=6) public Integer areaId = null;
    @Tag(tag=12,isSigned=true) public Integer retcode = null;
}
