package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EvtLocalGadgetOwnerLeaveSceneNotify {
    public enum EvtLocalGadgetOwnerLeaveSceneNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=360) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11) public Integer entityId = null;
}
