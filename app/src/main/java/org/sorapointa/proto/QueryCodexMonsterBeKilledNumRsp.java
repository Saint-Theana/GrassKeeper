package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class QueryCodexMonsterBeKilledNumRsp {
    public enum QueryCodexMonsterBeKilledNumRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4205) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14) public List<Integer> beKilledNumList = new ArrayList<>();
    @Tag(tag=6,isSigned=true) public Integer retcode = null;
    @Tag(tag=4) public List<Integer> codexIdList = new ArrayList<>();
    @Tag(tag=5) public List<Integer> beCapturedNumList = new ArrayList<>();
}
