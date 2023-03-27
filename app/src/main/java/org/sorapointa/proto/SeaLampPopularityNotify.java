package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SeaLampPopularityNotify {
    public enum SeaLampPopularityNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2076) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2) public Integer popularity = null;
}
