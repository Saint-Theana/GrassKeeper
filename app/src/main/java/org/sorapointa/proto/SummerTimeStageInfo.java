package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SummerTimeStageInfo {
    @Tag(tag=6) public Integer openTime = null;
    @Tag(tag=3) public Boolean isOpen = null;
    @Tag(tag=4) public Integer stageId = null;
}
