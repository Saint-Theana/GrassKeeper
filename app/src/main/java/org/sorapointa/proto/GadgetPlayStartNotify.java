package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GadgetPlayStartNotify {
    public enum GadgetPlayStartNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=862) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=6) public Integer playType = null;
    @Tag(tag=13) public Integer entityId = null;
    @Tag(tag=9) public Integer startTime = null;
}
