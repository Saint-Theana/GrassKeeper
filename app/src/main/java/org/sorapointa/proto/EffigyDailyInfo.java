package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EffigyDailyInfo {
    @Tag(tag=15) public Integer challengeId = null;
    @Tag(tag=2) public Boolean isFirstPassRewardTaken = null;
    @Tag(tag=10) public Integer challengeTotalScore = null;
    @Tag(tag=14) public Integer dayIndex = null;
    @Tag(tag=6) public Integer challengeMaxScore = null;
    @Tag(tag=7) public Integer beginTime = null;
    @Tag(tag=12) public Integer challengeCount = null;
}
