package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class QuestDestroyEntityReq {
    @Tag(tag=2) public Integer sceneId = null;
    @Tag(tag=9) public Integer entityId = null;
    @Tag(tag=8) public Integer questId = null;
}
