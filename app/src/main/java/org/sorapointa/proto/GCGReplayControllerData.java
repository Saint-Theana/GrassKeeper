package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGReplayControllerData {
    @Tag(tag=7) public Integer controllerId = null;
    @Tag(tag=9) public List<Integer> cardIdList = new ArrayList<>();
}
