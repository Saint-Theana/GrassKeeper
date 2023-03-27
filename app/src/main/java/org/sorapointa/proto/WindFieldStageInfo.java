package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WindFieldStageInfo {
    @Tag(tag=13) public Integer openTime = null;
    @Tag(tag=2) public Boolean isOpen = null;
    @Tag(tag=10) public Integer stageId = null;
}
