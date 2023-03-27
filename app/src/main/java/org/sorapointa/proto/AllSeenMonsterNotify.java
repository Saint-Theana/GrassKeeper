package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AllSeenMonsterNotify {
    public enum AllSeenMonsterNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=244) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=2) public List<Integer> monsterIdList = new ArrayList<>();
}
