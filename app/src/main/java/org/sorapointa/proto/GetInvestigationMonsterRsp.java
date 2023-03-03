package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.InvestigationMonster.*;
import org.sorapointa.proto.InvestigationMonster;

public class GetInvestigationMonsterRsp {
    @Tag(tag=10) public List<InvestigationMonster> monsterList = new ArrayList<>();
    @Tag(tag=1,isSigned=true) public Integer retcode = null;
    @Tag(tag=2) public Boolean isForMark = null;
}
