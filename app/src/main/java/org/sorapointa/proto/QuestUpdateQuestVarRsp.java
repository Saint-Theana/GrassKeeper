package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class QuestUpdateQuestVarRsp {
    @Tag(tag=10,isSigned=true) public Integer retcode = null;
    @Tag(tag=2) public Integer parentQuestVarSeq = null;
    @Tag(tag=8) public Integer parentQuestId = null;
    @Tag(tag=15) public Integer questId = null;
}
