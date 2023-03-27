package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGMatchInfo {
    @Tag(tag=5) public List<MatchPlayerInfo> playerList = new ArrayList<>();
}
