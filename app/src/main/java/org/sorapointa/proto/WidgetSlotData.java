package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.WidgetSlotTag.*;
import org.sorapointa.proto.WidgetSlotTag;

public class WidgetSlotData {
    @Tag(tag=9) public Integer cdOverTime = null;
    @Tag(tag=14) public Integer tag = null;
    @Tag(tag=11) public Integer materialId = null;
    @Tag(tag=12) public Boolean isActive = null;
}
