package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.QuestVarOp.*;
import org.sorapointa.proto.QuestVarOp;

public class QuestUpdateQuestVarReq {
    @Tag(tag=9) public Integer parentQuestId = null;
    @Tag(tag=4) public List<QuestVarOp> questVarOpList = new ArrayList<>();
    @Tag(tag=11) public Integer questId = null;
    @Tag(tag=1) public Integer parentQuestVarSeq = null;
}
