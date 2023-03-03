package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetSceneNpcPositionReq {
    @Tag(tag=6) public List<Integer> npcIdList = new ArrayList<>();
    @Tag(tag=8) public Integer sceneId = null;
}
