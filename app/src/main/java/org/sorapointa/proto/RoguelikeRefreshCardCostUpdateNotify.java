package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RoguelikeRefreshCardCostUpdateNotify {
    public enum RoguelikeRefreshCardCostUpdateNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8164) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public Integer itemId = null;
    @Tag(tag=8) public Integer itemCount = null;
}
