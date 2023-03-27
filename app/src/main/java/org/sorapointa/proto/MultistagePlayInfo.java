package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MultistagePlayInfo {
    @Tag(tag=13) public Integer stageIndex = null;
    @Tag(tag=8) public Integer beginTime = null;
    @Tag(tag=15) public Integer duration = null;
    @Tag(tag=3) public Integer playIndex = null;
    @Tag(tag=9) public Integer stageType = null;
    @Tag(tag=12) public Integer groupId = null;
    @Tag(tag=10) public Integer playType = null;
    @Tag(tag=1387) public MechanicusInfo mechanicusInfo = null;
    @Tag(tag=2006) public FleurFairInfo fleurFairInfo = null;
    @Tag(tag=1418) public HideAndSeekInfo hideAndSeekInfo = null;
    @Tag(tag=1939) public ChessInfo chessInfo = null;
    @Tag(tag=452) public IrodoriChessInfo irodoriChessInfo = null;
    @Tag(tag=1200) public CharAmusementInfo charAmusementInfo = null;
    @Tag(tag=1701) public BrickBreakerInfo brickBreakerInfo = null;
    @Tag(tag=1451) public CoinCollectInfo coinCollectInfo = null;
    @Tag(tag=424) public LanV3BoatInfo lanV3boatInfo = null;
}
