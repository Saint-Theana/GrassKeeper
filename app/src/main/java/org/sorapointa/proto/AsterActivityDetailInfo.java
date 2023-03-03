package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AsterLargeDetailInfo.*;
import org.sorapointa.proto.AsterLargeDetailInfo;
import org.sorapointa.proto.AsterLittleDetailInfo.*;
import org.sorapointa.proto.AsterLittleDetailInfo;
import org.sorapointa.proto.AsterMidDetailInfo.*;
import org.sorapointa.proto.AsterMidDetailInfo;
import org.sorapointa.proto.AsterProgressDetailInfo.*;
import org.sorapointa.proto.AsterProgressDetailInfo;

public class AsterActivityDetailInfo {
    @Tag(tag=7) public AsterLittleDetailInfo asterLittle = null;
    @Tag(tag=14) public Integer asterCredit = null;
    @Tag(tag=9) public AsterLargeDetailInfo asterLarge = null;
    @Tag(tag=1) public Boolean isSpecialRewardTaken = null;
    @Tag(tag=13) public Boolean isContentClosed = null;
    @Tag(tag=8) public Integer contentCloseTime = null;
    @Tag(tag=5) public Integer asterToken = null;
    @Tag(tag=6) public AsterMidDetailInfo asterMid = null;
    @Tag(tag=2) public AsterProgressDetailInfo asterProgress = null;
}
