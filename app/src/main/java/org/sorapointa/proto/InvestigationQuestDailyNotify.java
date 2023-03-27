package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class InvestigationQuestDailyNotify {
    public enum InvestigationQuestDailyNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1910) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

}
