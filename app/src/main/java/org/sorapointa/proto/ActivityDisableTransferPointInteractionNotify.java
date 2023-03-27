package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ActivityDisableTransferPointInteractionNotify {
    public enum ActivityDisableTransferPointInteractionNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8440) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public Boolean isDisable = null;
    @Tag(tag=8) public Uint32Pair scenePointPair = null;
}
