package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ClientReconnectNotify {
    public enum ClientReconnectNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=29) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=1) public Integer reason = null;
}
