package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BartenderGetFormulaRsp {
    @Tag(tag=12) public Boolean isNew = null;
    @Tag(tag=6,isSigned=true) public Integer retcode = null;
    @Tag(tag=8) public List<Integer> affixList = new ArrayList<>();
    @Tag(tag=11) public Integer formulaId = null;
}
