package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SummerTimeV2DungeonStageInfo {
    @Tag(tag=10) public Integer stageId = null;
    @Tag(tag=3) public Boolean isOpen = null;
    @Tag(tag=12) public Integer openTime = null;
    @Tag(tag=15) public Boolean isPrevDungeonSucceed = null;
}
