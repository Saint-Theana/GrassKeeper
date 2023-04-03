package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.WidgetSlotOp.*;
import org.sorapointa.proto.WidgetSlotOp;
import org.sorapointa.proto.WidgetSlotTag.*;
import org.sorapointa.proto.WidgetSlotTag;

public class SetWidgetSlotRsp {
    public enum SetWidgetSlotRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4284) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public List<Integer> tagList = new ArrayList<>();
    @Tag(tag=5,isSigned=true) public Integer retcode = null;
    @Tag(tag=12) public Integer materialId = null;
    @Tag(tag=9) public Integer op = null;
}
