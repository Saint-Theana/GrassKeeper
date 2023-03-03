package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.WidgetCreateLocationInfo.*;
import org.sorapointa.proto.WidgetCreateLocationInfo;
import org.sorapointa.proto.WidgetCreatorOpType.*;
import org.sorapointa.proto.WidgetCreatorOpType;

public class WidgetCreatorInfo {
    @Tag(tag=10) public Integer opType = null;
    @Tag(tag=1) public Integer entityId = null;
    @Tag(tag=12) public WidgetCreateLocationInfo locationInfo = null;
}
