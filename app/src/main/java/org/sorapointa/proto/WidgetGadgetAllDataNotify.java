package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.WidgetGadgetData.*;
import org.sorapointa.proto.WidgetGadgetData;

public class WidgetGadgetAllDataNotify {
    @Tag(tag=13) public List<WidgetGadgetData> widgetGadgetData = new ArrayList<>();
}
