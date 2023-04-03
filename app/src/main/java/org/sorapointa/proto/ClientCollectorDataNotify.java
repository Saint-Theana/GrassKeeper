package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ClientCollectorData.*;
import org.sorapointa.proto.ClientCollectorData;

public class ClientCollectorDataNotify {
    public enum ClientCollectorDataNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4292) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public List<ClientCollectorData> clientCollectorDataList = new ArrayList<>();
}
