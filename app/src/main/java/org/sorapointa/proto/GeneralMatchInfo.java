package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MatchPlayerInfo.*;
import org.sorapointa.proto.MatchPlayerInfo;

public class GeneralMatchInfo {
    @Tag(tag=1) public Integer matchParam = null;
    @Tag(tag=9) public Integer matchId = null;
    @Tag(tag=5) public List<MatchPlayerInfo> playerList = new ArrayList<>();
}
