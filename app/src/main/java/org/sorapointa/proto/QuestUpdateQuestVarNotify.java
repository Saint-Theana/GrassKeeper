package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class QuestUpdateQuestVarNotify {
    @Tag(tag=1,isSigned=true) public List<Integer> questVar = new ArrayList<>();
    @Tag(tag=12) public Integer parentQuestId = null;
    @Tag(tag=8) public Integer parentQuestVarSeq = null;
}
