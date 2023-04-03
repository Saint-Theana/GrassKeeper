package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.TreasureMapBonusChallengeInfo.*;
import org.sorapointa.proto.TreasureMapBonusChallengeInfo;

public class TreasureMapBonusChallengeNotify {
    public enum TreasureMapBonusChallengeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2056) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5) public TreasureMapBonusChallengeInfo info = null;
}
