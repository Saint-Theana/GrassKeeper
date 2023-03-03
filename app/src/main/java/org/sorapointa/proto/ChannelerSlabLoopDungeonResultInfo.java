package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChannelerSlabLoopDungeonResultInfo {
    @Tag(tag=11) public Boolean isSuccess = null;
    @Tag(tag=8) public Integer challengeMaxScore = null;
    @Tag(tag=7) public Integer dungeonIndex = null;
    @Tag(tag=10) public Boolean isInTimeLimit = null;
    @Tag(tag=12) public Integer challengeScore = null;
}
