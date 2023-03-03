package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SceneNpcInfo {
    @Tag(tag=1) public Integer npcId = null;
    @Tag(tag=2) public Integer roomId = null;
    @Tag(tag=3) public Integer parentQuestId = null;
    @Tag(tag=4) public Integer blockId = null;
}
