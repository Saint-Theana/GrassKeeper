package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BossChestActivateNotify {
    public enum BossChestActivateNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=880) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=6) public List<Integer> qualifyUidList = new ArrayList<>();
    @Tag(tag=4) public Integer entityId = null;
}
