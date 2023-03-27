package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GadgetStateNotify {
    public enum GadgetStateNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=887) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public Integer gadgetState = null;
    @Tag(tag=7) public Integer gadgetEntityId = null;
    @Tag(tag=15) public Boolean isEnableInteract = null;
}
