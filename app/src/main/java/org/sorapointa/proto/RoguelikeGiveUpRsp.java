package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.RoguelikeDungeonSettleInfo.*;
import org.sorapointa.proto.RoguelikeDungeonSettleInfo;

public class RoguelikeGiveUpRsp {
    @Tag(tag=4,isSigned=true) public Integer retcode = null;
    @Tag(tag=7) public Integer stageId = null;
    @Tag(tag=8) public RoguelikeDungeonSettleInfo settleInfo = null;
}
