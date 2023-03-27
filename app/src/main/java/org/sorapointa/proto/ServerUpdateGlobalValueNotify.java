package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ServerUpdateGlobalValueNotify {
    public enum ServerUpdateGlobalValueNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1178) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2,isFloat=true) public Float value = null;
    @Tag(tag=8) public Integer updateType = null;
    @Tag(tag=10) public Integer keyHash = null;
    @Tag(tag=3) public Integer entityId = null;
    @Tag(tag=12,isFloat=true) public Float delta = null;
}
