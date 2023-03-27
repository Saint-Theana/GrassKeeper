package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class LanV3BoatInfo {
    @Tag(tag=4) public List<Integer> playerUidList = new ArrayList<>();
    @Tag(tag=11) public Integer matchId = null;
    @Tag(tag=15) public Integer mapId = null;
    @Tag(tag=8) public Boolean isSingle = null;
}
