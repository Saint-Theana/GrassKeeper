package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetInvestigationMonsterReq {
    public enum GetInvestigationMonsterReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1915) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=1) public List<Integer> cityIdList = new ArrayList<>();
    @Tag(tag=4) public Boolean isForMark = null;
}
