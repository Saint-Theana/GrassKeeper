package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MechanicusSequenceOpenNotify {
    public enum MechanicusSequenceOpenNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3987) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5) public Integer mechanicusId = null;
    @Tag(tag=4) public Integer sequenceId = null;
}
