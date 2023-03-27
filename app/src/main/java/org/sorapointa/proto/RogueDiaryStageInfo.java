package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RogueDiaryStageInfo {
    @Tag(tag=3) public Integer stageId = null;
    @Tag(tag=4) public RogueDiaryDungeonRecord bestRecord = null;
    @Tag(tag=9) public Boolean isHaveTry = null;
}
