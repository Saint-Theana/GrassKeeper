package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WindFieldInfo {
    @Tag(tag=13) public Integer killedMonsterNum = null;
    @Tag(tag=4) public Integer challengeTimestamp = null;
    @Tag(tag=12) public Integer coinNum = null;
    @Tag(tag=10) public Integer elementBallNum = null;
    @Tag(tag=15) public Integer challengeBallCurCount = null;
    @Tag(tag=8) public Integer challengeTotalTime = null;
    @Tag(tag=7) public Integer showId = null;
    @Tag(tag=9) public Integer challengeBallMaxCount = null;
}
