package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SealBattleType.*;
import org.sorapointa.proto.SealBattleType;

public class SealBattleBeginNotify {
    public enum SealBattleBeginNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=261) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12) public Integer sealRadius = null;
    @Tag(tag=2) public Integer sealMaxProgress = null;
    @Tag(tag=15) public Integer sealEntityId = null;
    @Tag(tag=4) public Integer battleType = null;
}
