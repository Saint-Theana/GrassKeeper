package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class QuestDestroyNpcReq {
    @Tag(tag=1) public Integer npcId = null;
    @Tag(tag=12) public Integer parentQuestId = null;
}
