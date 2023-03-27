package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetWidgetSlotRsp {
    public enum GetWidgetSlotRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4263) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15,isSigned=true) public Integer retcode = null;
    @Tag(tag=13) public List<WidgetSlotData> slotList = new ArrayList<>();
}
