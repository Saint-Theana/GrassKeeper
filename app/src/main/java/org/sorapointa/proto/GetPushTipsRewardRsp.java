package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetPushTipsRewardRsp {
    @Tag(tag=10,isSigned=true) public Integer retcode = null;
    @Tag(tag=9) public List<Integer> pushTipsIdList = new ArrayList<>();
}
