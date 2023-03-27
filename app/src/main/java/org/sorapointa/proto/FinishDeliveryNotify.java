package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FinishDeliveryNotify {
    public enum FinishDeliveryNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2044) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2) public Integer dayIndex = null;
    @Tag(tag=4) public Integer finishedQuestIndex = null;
    @Tag(tag=8) public Integer scheduleId = null;
}
