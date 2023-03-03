package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ShowTemplateReminderNotify {
    @Tag(tag=1) public Boolean isRevoke = null;
    @Tag(tag=14) public Integer templateReminderId = null;
    @Tag(tag=3) public List<Integer> paramUidList = new ArrayList<>();
    @Tag(tag=10,isSigned=true) public List<Integer> paramList = new ArrayList<>();
    @Tag(tag=15) public Boolean isNeedCache = null;
}
