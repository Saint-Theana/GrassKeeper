package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.WidgetGadgetData.*;
import org.sorapointa.proto.WidgetGadgetData;

public class WidgetGadgetAllDataNotify {
    public enum WidgetGadgetAllDataNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4259) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public List<WidgetGadgetData> widgetGadgetData = new ArrayList<>();
}
