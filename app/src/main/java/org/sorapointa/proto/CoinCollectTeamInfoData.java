package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CoinCollectTeamInfoData {
    @Tag(tag=5) public List<Integer> avatarCostumeIdList = new ArrayList<>();
    @Tag(tag=7) public Integer playerUid = null;
    @Tag(tag=15) public Boolean isHost = null;
    @Tag(tag=3) public Integer chooseSkillNo = null;
    @Tag(tag=6) public List<Integer> avatarLvList = new ArrayList<>();
    @Tag(tag=2) public List<Integer> avatarIdList = new ArrayList<>();
}
