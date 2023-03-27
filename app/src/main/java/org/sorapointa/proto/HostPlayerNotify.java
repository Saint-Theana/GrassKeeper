package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HostPlayerNotify {
    public enum HostPlayerNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=387) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public Integer hostUid = null;
    @Tag(tag=5) public Integer hostPeerId = null;
}
