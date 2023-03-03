package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.WidgetSlotData.*;
import org.sorapointa.proto.WidgetSlotData;

public class PlayerWidgetInfo {
    @Tag(tag=14) public Integer uid = null;
    @Tag(tag=13) public List<WidgetSlotData> slotList = new ArrayList<>();
}
