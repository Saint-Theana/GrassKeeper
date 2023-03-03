package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BattlePassMissionDelNotify {
    @Tag(tag=10) public List<Integer> delMissionIdList = new ArrayList<>();
}
