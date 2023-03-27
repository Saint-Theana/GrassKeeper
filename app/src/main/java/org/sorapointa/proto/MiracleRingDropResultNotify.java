package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MiracleRingDropResultNotify {
    public enum MiracleRingDropResultNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5243) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=6,isSigned=true) public Integer dropResult = null;
    @Tag(tag=9,isSigned=true) public Integer lastTakeRewardTime = null;
}
