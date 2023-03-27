package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChessActivityDetailInfo {
    @Tag(tag=4) public Integer punishOverTime = null;
    @Tag(tag=10) public Integer contentCloseTime = null;
    @Tag(tag=5) public Integer availableExp = null;
    @Tag(tag=11) public Integer exp = null;
    @Tag(tag=6) public Boolean isTeachDungeonFinished = null;
    @Tag(tag=8) public Integer obtainedExp = null;
    @Tag(tag=14) public Integer level = null;
    @Tag(tag=7) public List<Integer> finishedMapIdList = new ArrayList<>();
    @Tag(tag=15) public Boolean isContentClosed = null;
}
