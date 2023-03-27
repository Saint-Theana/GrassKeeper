package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BartenderGetFormulaRsp {
    public enum BartenderGetFormulaRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8550) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12) public Boolean isNew = null;
    @Tag(tag=15) public Integer formulaId = null;
    @Tag(tag=9) public List<Integer> affixList = new ArrayList<>();
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
}
