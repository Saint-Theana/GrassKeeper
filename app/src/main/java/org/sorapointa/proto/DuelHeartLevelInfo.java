package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DuelHeartLevelInfo {
    @Tag(tag=1) public Boolean isCgViewed = null;
    @Tag(tag=11) public Integer levelId = null;
    @Tag(tag=8) public List<DuelHeartLevelDifficultyInfo> difficultyInfoList = new ArrayList<>();
    @Tag(tag=12) public Boolean isOpen = null;
}
