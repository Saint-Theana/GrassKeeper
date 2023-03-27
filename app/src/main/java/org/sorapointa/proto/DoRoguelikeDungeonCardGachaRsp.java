package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DoRoguelikeDungeonCardGachaRsp {
    public enum DoRoguelikeDungeonCardGachaRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8820) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public Boolean isCanRefresh = null;
    @Tag(tag=15,isSigned=true) public Integer retcode = null;
    @Tag(tag=8) public List<Integer> cardList = new ArrayList<>();
}
