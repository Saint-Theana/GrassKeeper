package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerWidgetInfo {
    @Tag(tag=15) public List<WidgetSlotData> slotList = new ArrayList<>();
    @Tag(tag=10) public Integer uid = null;
}
