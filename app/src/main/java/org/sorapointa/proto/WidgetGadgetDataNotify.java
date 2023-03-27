package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WidgetGadgetDataNotify {
    public enum WidgetGadgetDataNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4282) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10) public WidgetGadgetData widgetGadgetData = null;
}
