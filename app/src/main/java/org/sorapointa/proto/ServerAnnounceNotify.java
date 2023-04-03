package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AnnounceData.*;
import org.sorapointa.proto.AnnounceData;

public class ServerAnnounceNotify {
    public enum ServerAnnounceNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2148) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=1) public List<AnnounceData> announceDataList = new ArrayList<>();
}
