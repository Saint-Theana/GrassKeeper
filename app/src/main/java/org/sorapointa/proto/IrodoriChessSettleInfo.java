package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class IrodoriChessSettleInfo {
    @Tag(tag=10) public Boolean isActivityEnd = null;
    @Tag(tag=2) public Integer killMonsterNum = null;
    @Tag(tag=12) public Boolean isNewRecord = null;
    @Tag(tag=14) public Long sceneTimeMs = null;
    @Tag(tag=15) public Integer settleScore = null;
    @Tag(tag=5) public Boolean isPerfect = null;
}
