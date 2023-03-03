package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.WidgetSlotData.*;
import org.sorapointa.proto.WidgetSlotData;

public class WidgetActiveChangeNotify {
    @Tag(tag=5) public List<WidgetSlotData> widgetDataList = new ArrayList<>();
}
