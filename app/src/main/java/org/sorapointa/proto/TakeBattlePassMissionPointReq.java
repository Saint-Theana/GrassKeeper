package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TakeBattlePassMissionPointReq {
    @Tag(tag=5) public List<Integer> missionIdList = new ArrayList<>();
}
