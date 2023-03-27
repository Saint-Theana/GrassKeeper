package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DebugNotify {
    public enum DebugNotify_Enum {
        @Tag(tag=0) Zero ,
        @Tag(tag=101) CmdId ,
        @Tag(tag=101) TargetService ,
        @Tag(tag=2) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=1) public Integer id = null;
    @Tag(tag=2) public String name = null;
    @Tag(tag=3) public Integer retcode = null;
}
