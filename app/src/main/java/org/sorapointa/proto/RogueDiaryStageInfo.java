package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.RogueDiaryDungeonRecord.*;
import org.sorapointa.proto.RogueDiaryDungeonRecord;

public class RogueDiaryStageInfo {
    @Tag(tag=1) public Integer stageId = null;
    @Tag(tag=12) public RogueDiaryDungeonRecord bestRecord = null;
    @Tag(tag=10) public Boolean isHaveTry = null;
}
