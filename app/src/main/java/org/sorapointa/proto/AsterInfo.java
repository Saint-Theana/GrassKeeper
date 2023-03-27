package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AsterInfo {
    @Tag(tag=2) public AsterLargeDetailInfo asterLarge = null;
    @Tag(tag=8) public Integer asterToken = null;
    @Tag(tag=9) public Boolean isSpecialRewardTaken = null;
    @Tag(tag=3) public AsterLittleDetailInfo asterLittle = null;
    @Tag(tag=14) public Integer contentCloseTime = null;
    @Tag(tag=10) public Integer asterCredit = null;
    @Tag(tag=4) public AsterMidDetailInfo asterMid = null;
    @Tag(tag=7) public AsterProgressDetailInfo asterProgress = null;
    @Tag(tag=15) public Boolean isContentClosed = null;
}
