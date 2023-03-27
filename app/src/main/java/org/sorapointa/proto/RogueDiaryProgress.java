package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RogueDiaryProgress {
    @Tag(tag=5) public Boolean isEnterDungeon = null;
    @Tag(tag=12) public List<Integer> optionalCardList = new ArrayList<>();
    @Tag(tag=7) public Integer curRound = null;
    @Tag(tag=3) public Integer stageId = null;
    @Tag(tag=11) public Integer difficulty = null;
}
