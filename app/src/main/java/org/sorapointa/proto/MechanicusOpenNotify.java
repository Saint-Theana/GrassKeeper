package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MechanicusOpenNotify {
    public enum MechanicusOpenNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3920) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2) public Integer mechanicusId = null;
}
