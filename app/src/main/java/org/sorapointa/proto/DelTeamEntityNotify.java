package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DelTeamEntityNotify {
    @Tag(tag=15) public List<Integer> delEntityIdList = new ArrayList<>();
    @Tag(tag=8) public Integer sceneId = null;
}
