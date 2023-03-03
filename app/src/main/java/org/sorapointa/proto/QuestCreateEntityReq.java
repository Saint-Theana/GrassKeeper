package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CreateEntityInfo.*;
import org.sorapointa.proto.CreateEntityInfo;

public class QuestCreateEntityReq {
    @Tag(tag=9) public Integer parentQuestId = null;
    @Tag(tag=3) public Boolean isRewind = null;
    @Tag(tag=2) public Integer questId = null;
    @Tag(tag=13) public CreateEntityInfo entity = null;
}
