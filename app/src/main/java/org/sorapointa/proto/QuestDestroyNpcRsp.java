package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class QuestDestroyNpcRsp {
    @Tag(tag=12) public Integer npcId = null;
    @Tag(tag=4) public Integer parentQuestId = null;
    @Tag(tag=5,isSigned=true) public Integer retcode = null;
}
