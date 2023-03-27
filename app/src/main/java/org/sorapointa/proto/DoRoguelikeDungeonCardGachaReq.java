package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DoRoguelikeDungeonCardGachaReq {
    public enum DoRoguelikeDungeonCardGachaReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8752) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=13) public Integer cellId = null;
    @Tag(tag=6) public Integer dungeonId = null;
}
