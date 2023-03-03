package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChessActivityDetailInfo {
    @Tag(tag=4) public Integer level = null;
    @Tag(tag=9) public Boolean isTeachDungeonFinished = null;
    @Tag(tag=14) public Integer contentCloseTime = null;
    @Tag(tag=8) public Integer obtainedExp = null;
    @Tag(tag=5) public Boolean isContentClosed = null;
    @Tag(tag=2) public Integer availableExp = null;
    @Tag(tag=13) public Integer exp = null;
    @Tag(tag=1) public List<Integer> finishedMapIdList = new ArrayList<>();
    @Tag(tag=3) public Integer punishOverTime = null;
}
