package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGHeartBeatNotify {
    public enum IMDPCLGHIIH {
        @Tag(tag=0) None ,
        @Tag(tag=7499) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=3) public Integer serverSeq = null;
}
