package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GadgetPlayDataNotify {
    public enum GadgetPlayDataNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=824) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2) public Integer playType = null;
    @Tag(tag=15) public Integer progress = null;
    @Tag(tag=5) public Integer entityId = null;
}
