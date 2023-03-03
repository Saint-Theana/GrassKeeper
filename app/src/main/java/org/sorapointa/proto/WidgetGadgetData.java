package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WidgetGadgetData {
    @Tag(tag=1) public List<Integer> gadgetEntityIdList = new ArrayList<>();
    @Tag(tag=8) public Integer gadgetId = null;
}
