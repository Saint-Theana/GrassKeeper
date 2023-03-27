package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BartenderCompleteOrderRsp {
    public enum BartenderCompleteOrderRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8192) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11) public List<Integer> affixList = new ArrayList<>();
    @Tag(tag=15,isSigned=true) public Integer retcode = null;
    @Tag(tag=6) public Integer questId = null;
    @Tag(tag=7) public Integer finishOrderId = null;
    @Tag(tag=14) public Boolean isNew = null;
    @Tag(tag=3) public Integer formulaId = null;
}
