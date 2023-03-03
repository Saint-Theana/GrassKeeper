package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.WidgetCoolDownData.*;
import org.sorapointa.proto.WidgetCoolDownData;

public class WidgetCoolDownNotify {
    @Tag(tag=1) public List<WidgetCoolDownData> normalCoolDownDataList = new ArrayList<>();
    @Tag(tag=12) public List<WidgetCoolDownData> groupCoolDownDataList = new ArrayList<>();
}
