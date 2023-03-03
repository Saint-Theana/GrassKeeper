package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CreateEntityInfo.*;
import org.sorapointa.proto.CreateEntityInfo;

public class QuestCreateEntityRsp {
    @Tag(tag=13) public Integer questId = null;
    @Tag(tag=8,isSigned=true) public Integer retcode = null;
    @Tag(tag=7) public Integer entityId = null;
    @Tag(tag=11) public CreateEntityInfo entity = null;
    @Tag(tag=1) public Integer parentQuestId = null;
    @Tag(tag=14) public Boolean isRewind = null;
}
