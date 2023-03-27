package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetInvestigationMonsterRsp {
    public enum GetInvestigationMonsterRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1927) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=6,isSigned=true) public Integer retcode = null;
    @Tag(tag=2) public List<InvestigationMonster> monsterList = new ArrayList<>();
    @Tag(tag=11) public Boolean isForMark = null;
}
