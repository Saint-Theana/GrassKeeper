package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BartenderCompleteOrderRsp {
    @Tag(tag=10) public Boolean isNew = null;
    @Tag(tag=3) public Integer finishOrderId = null;
    @Tag(tag=4,isSigned=true) public Integer retcode = null;
    @Tag(tag=6) public Integer formulaId = null;
    @Tag(tag=15) public Integer questId = null;
    @Tag(tag=2) public List<Integer> affixList = new ArrayList<>();
}
