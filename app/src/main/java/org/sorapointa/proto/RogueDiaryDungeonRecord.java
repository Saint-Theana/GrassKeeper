package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RogueDiaryDungeonRecord {
    @Tag(tag=9) public Integer finishTime = null;
    @Tag(tag=12) public Integer maxRound = null;
    @Tag(tag=7) public Boolean isFinish = null;
    @Tag(tag=13) public Integer difficulty = null;
}
