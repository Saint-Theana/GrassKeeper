package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.WidgetSlotData.*;
import org.sorapointa.proto.WidgetSlotData;

public class WidgetActiveChangeNotify {
    public enum WidgetActiveChangeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4278) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public List<WidgetSlotData> widgetDataList = new ArrayList<>();
}
