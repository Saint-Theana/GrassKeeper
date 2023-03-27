package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HuntingOngoingNotify {
    public enum HuntingOngoingNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4340) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public Integer failTime = null;
    @Tag(tag=8) public Integer finishClueCount = null;
    @Tag(tag=5) public Boolean isStarted = null;
    @Tag(tag=10) public HuntingPair huntingPair = null;
    @Tag(tag=14) public Vector nextPosition = null;
    @Tag(tag=11) public Boolean isFinal = null;
}
