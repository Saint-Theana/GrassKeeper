package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.WidgetSlotData.*;
import org.sorapointa.proto.WidgetSlotData;
import org.sorapointa.proto.WidgetSlotOp.*;
import org.sorapointa.proto.WidgetSlotOp;

public class WidgetSlotChangeNotify {
    @Tag(tag=11) public Integer op = null;
    @Tag(tag=8) public WidgetSlotData slot = null;
}
