package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ServerGlobalValueChangeNotify {
    public enum ServerGlobalValueChangeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1116) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10,isFloat=true) public Float value = null;
    @Tag(tag=6) public Integer keyHash = null;
    @Tag(tag=11) public Integer entityId = null;
}
