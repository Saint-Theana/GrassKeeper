package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TreasureMapMpChallengeNotify {
    public enum TreasureMapMpChallengeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2054) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

}
