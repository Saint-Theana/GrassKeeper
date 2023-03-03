package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class NpcTalkReq {
    @Tag(tag=8) public Integer entityId = null;
    @Tag(tag=9) public Integer npcEntityId = null;
    @Tag(tag=7) public Integer talkId = null;
}
