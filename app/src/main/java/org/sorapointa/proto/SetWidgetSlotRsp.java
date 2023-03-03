package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.WidgetSlotOp.*;
import org.sorapointa.proto.WidgetSlotOp;
import org.sorapointa.proto.WidgetSlotTag.*;
import org.sorapointa.proto.WidgetSlotTag;

public class SetWidgetSlotRsp {
    @Tag(tag=15) public List<Integer> tagList = new ArrayList<>();
    @Tag(tag=6,isSigned=true) public Integer retcode = null;
    @Tag(tag=1) public Integer materialId = null;
    @Tag(tag=4) public Integer op = null;
}
