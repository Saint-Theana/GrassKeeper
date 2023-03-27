package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGGameBriefData {
    @Tag(tag=11) public Integer verifyCode = null;
    @Tag(tag=5) public List<GCGPlayerBriefData> playerBriefList = new ArrayList<>();
    @Tag(tag=10) public Integer businessType = null;
    @Tag(tag=1) public Integer gameId = null;
    @Tag(tag=6) public Integer gameUid = null;
    @Tag(tag=13) public Integer platformType = null;
}
