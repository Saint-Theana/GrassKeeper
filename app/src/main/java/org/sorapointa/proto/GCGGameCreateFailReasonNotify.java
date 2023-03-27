package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGGameCreateFailReasonNotify {
    public enum NGJHBGBPDDB {
        @Tag(tag=0) None ,
        @Tag(tag=7551) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2) public Integer reason = null;
}
