package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MechanicusCloseNotify {
    public enum MechanicusCloseNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3974) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12) public Integer mechanicusId = null;
}
