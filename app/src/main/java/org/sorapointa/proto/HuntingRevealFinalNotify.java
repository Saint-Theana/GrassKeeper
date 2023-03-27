package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HuntingRevealFinalNotify {
    public enum HuntingRevealFinalNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4316) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11) public HuntingPair huntingPair = null;
    @Tag(tag=2) public Integer finishedGroupId = null;
    @Tag(tag=5) public Vector finalPosition = null;
}
