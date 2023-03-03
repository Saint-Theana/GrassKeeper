package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WindFieldGalleryInfoNotify {
    @Tag(tag=3) public Integer showId = null;
    @Tag(tag=7) public Integer killedMonsterNum = null;
    @Tag(tag=9) public Integer coinNum = null;
    @Tag(tag=1) public Integer challengeBallMaxCount = null;
    @Tag(tag=5) public Integer challengeTotalTime = null;
    @Tag(tag=10) public Integer challengeBallCurCount = null;
    @Tag(tag=4) public Integer challengeTimestamp = null;
    @Tag(tag=14) public Integer elementBallNum = null;
}
