package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CoinCollectTeamInfoData.*;
import org.sorapointa.proto.CoinCollectTeamInfoData;

public class CoinCollectLevelData {
    @Tag(tag=15) public Boolean isHavePlayDoubleLevel = null;
    @Tag(tag=6) public List<CoinCollectTeamInfoData> doubleBestTeamInfoList = new ArrayList<>();
    @Tag(tag=5) public CoinCollectTeamInfoData singleBestTeamInfo = null;
    @Tag(tag=13) public Integer doubleBestPassTimeMs = null;
    @Tag(tag=9) public Boolean isHavePlaySingleLevel = null;
    @Tag(tag=2) public Boolean isHaveWatchedCutscene = null;
    @Tag(tag=10) public Integer doubleBestCollectNum = null;
    @Tag(tag=8) public Integer lastChooseSkillNo = null;
    @Tag(tag=14) public Integer singleBestCollectNum = null;
    @Tag(tag=3) public Integer singleBestPassTimeMs = null;
    @Tag(tag=7) public Integer levelId = null;
    @Tag(tag=12) public Boolean isLevelOpen = null;
}
