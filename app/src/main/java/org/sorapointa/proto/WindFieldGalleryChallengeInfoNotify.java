package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WindFieldGalleryChallengeInfoNotify {
    @Tag(tag=6) public Integer challengeTimestamp = null;
    @Tag(tag=8) public Boolean isStart = null;
    @Tag(tag=12) public Integer showId = null;
    @Tag(tag=7) public Boolean isSuccess = null;
    @Tag(tag=13) public Integer challengeTotalTime = null;
    @Tag(tag=11) public Integer challengeBallMaxCount = null;
    @Tag(tag=1) public Integer challengeBallCurCount = null;
}
