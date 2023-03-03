package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DungeonWayPointNotify {
    @Tag(tag=9) public Boolean isAdd = null;
    @Tag(tag=4) public List<Integer> activeWayPointList = new ArrayList<>();
}
