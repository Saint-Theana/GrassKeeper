package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RefreshRoguelikeDungeonCardRsp {
    public enum RefreshRoguelikeDungeonCardRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8302) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9,isSigned=true) public Integer retcode = null;
    @Tag(tag=12) public List<Integer> resCardList = new ArrayList<>();
}
