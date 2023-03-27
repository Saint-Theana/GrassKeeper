package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CoinCollectPlayerInfo {
    @Tag(tag=14) public List<CoinCollectTeamAvatarInfo> avatarInfoList = new ArrayList<>();
    @Tag(tag=8) public Boolean isPrepare = null;
    @Tag(tag=10) public Integer chooseSkillNo = null;
    @Tag(tag=4) public String playerName = null;
    @Tag(tag=5) public Integer playerUid = null;
}
