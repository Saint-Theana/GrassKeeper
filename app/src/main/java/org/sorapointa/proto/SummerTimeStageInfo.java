package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SummerTimeStageInfo {
    @Tag(tag=13) public Boolean isOpen = null;
    @Tag(tag=10) public Integer openTime = null;
    @Tag(tag=1) public Integer stageId = null;
}
