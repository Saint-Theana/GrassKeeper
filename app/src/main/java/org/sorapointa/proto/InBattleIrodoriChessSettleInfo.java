package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class InBattleIrodoriChessSettleInfo {
    @Tag(tag=5) public Boolean isNewRecord = null;
    @Tag(tag=2) public Boolean isActivityEnd = null;
    @Tag(tag=1) public Long sceneTimeMs = null;
    @Tag(tag=3) public Integer settleScore = null;
    @Tag(tag=12) public Boolean isPerfect = null;
    @Tag(tag=7) public Integer killMonsterNum = null;
}
