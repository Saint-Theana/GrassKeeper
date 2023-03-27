package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChannellerSlabLoopDungeonResultInfo {
    @Tag(tag=5) public Integer challengeMaxScore = null;
    @Tag(tag=13) public Boolean isSuccess = null;
    @Tag(tag=6) public Boolean isInTimeLimit = null;
    @Tag(tag=1) public Integer challengeScore = null;
    @Tag(tag=3) public Integer dungeonIndex = null;
}
