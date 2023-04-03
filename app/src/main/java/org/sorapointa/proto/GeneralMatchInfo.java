package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MatchPlayerInfo.*;
import org.sorapointa.proto.MatchPlayerInfo;

public class GeneralMatchInfo {
    @Tag(tag=6) public Integer matchParam = null;
    @Tag(tag=8) public Integer matchId = null;
    @Tag(tag=13) public List<MatchPlayerInfo> playerList = new ArrayList<>();
}
