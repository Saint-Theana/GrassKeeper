package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SummerTimeV2DungeonStageInfo {
    @Tag(tag=4) public Boolean isPrevDungeonSucceed = null;
    @Tag(tag=14) public Boolean isOpen = null;
    @Tag(tag=13) public Integer openTime = null;
    @Tag(tag=6) public Integer stageId = null;
}
