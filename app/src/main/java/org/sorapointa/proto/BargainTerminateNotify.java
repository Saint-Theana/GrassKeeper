package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BargainTerminateNotify {
    public enum BargainTerminateNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=475) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14) public Integer bargainId = null;
}
