package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GadgetTalkChangeNotify {
    public enum GadgetTalkChangeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=846) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10) public Integer gadgetEntityId = null;
    @Tag(tag=2) public Integer curGadgetTalkState = null;
}
