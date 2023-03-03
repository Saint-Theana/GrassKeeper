package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.WidgetCreateLocationInfo.*;
import org.sorapointa.proto.WidgetCreateLocationInfo;
import org.sorapointa.proto.WidgetCreatorInfo.*;
import org.sorapointa.proto.WidgetCreatorInfo;

public class WidgetDoBagReq {
    @Tag(tag=9) public Integer materialId = null;
    @Tag(tag=832) public WidgetCreateLocationInfo locationInfo = null;
    @Tag(tag=1497) public WidgetCreatorInfo widgetCreatorInfo = null;
}
