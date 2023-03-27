package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ShowTemplateReminderNotify {
    public enum ShowTemplateReminderNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3353) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public Boolean isRevoke = null;
    @Tag(tag=11) public Boolean isNeedCache = null;
    @Tag(tag=6) public List<Integer> paramUidList = new ArrayList<>();
    @Tag(tag=12,isSigned=true) public List<Integer> paramList = new ArrayList<>();
    @Tag(tag=9) public Integer templateReminderId = null;
}
