package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetBattlePassProductRsp {
    @Tag(tag=14,isSigned=true) public Integer retcode = null;
    @Tag(tag=6) public String priceTier = null;
    @Tag(tag=2) public Integer battlePassProductPlayType = null;
    @Tag(tag=1) public String productId = null;
    @Tag(tag=11) public Integer curScheduleId = null;
}
