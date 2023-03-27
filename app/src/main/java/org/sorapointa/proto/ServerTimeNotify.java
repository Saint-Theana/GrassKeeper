package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ServerTimeNotify {
    public enum ServerTimeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=14) CmdId ,
        @Tag(tag=1) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12) public Long serverTime = null;
}
