package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WidgetSlotChangeNotify {
    public enum WidgetSlotChangeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4283) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14) public Integer op = null;
    @Tag(tag=2) public WidgetSlotData slot = null;
}
