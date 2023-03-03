package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RogueDiaryProgress {
    @Tag(tag=7) public Integer difficulty = null;
    @Tag(tag=4) public List<Integer> optionalCardList = new ArrayList<>();
    @Tag(tag=9) public Boolean isEnterDungeon = null;
    @Tag(tag=12) public Integer stageId = null;
    @Tag(tag=3) public Integer curRound = null;
}
