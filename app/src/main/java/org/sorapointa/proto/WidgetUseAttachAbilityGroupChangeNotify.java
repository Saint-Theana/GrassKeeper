package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WidgetUseAttachAbilityGroupChangeNotify {
    public enum WidgetUseAttachAbilityGroupChangeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4270) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public Integer materialId = null;
    @Tag(tag=1) public Boolean isAttach = null;
}
