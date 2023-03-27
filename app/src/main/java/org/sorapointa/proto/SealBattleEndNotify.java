package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SealBattleEndNotify {
    public enum SealBattleEndNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=265) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=3) public Integer sealEntityId = null;
    @Tag(tag=13) public Boolean isWin = null;
}
