package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WindFieldStageInfo {
    @Tag(tag=12) public Boolean isOpen = null;
    @Tag(tag=14) public Integer openTime = null;
    @Tag(tag=8) public Integer stageId = null;
}
