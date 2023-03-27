package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TriggerCreateGadgetToEquipPartNotify {
    public enum TriggerCreateGadgetToEquipPartNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=342) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=3) public Integer entityId = null;
    @Tag(tag=5) public Integer gadgetId = null;
    @Tag(tag=4) public Integer gadgetEntityId = null;
    @Tag(tag=7) public String equipPart = null;
}
