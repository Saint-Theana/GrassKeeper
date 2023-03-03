package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DelScenePlayTeamEntityNotify {
    @Tag(tag=2) public List<Integer> delEntityIdList = new ArrayList<>();
    @Tag(tag=4) public Integer sceneId = null;
}
