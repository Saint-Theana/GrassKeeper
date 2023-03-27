package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ServerMessageNotify {
    public enum ServerMessageNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5745) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=6) public Integer index = null;
}
