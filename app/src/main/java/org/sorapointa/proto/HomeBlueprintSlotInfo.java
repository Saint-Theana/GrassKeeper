package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeBlueprintSlotInfo {
    @Tag(tag=12) public Integer moduleId = null;
    @Tag(tag=14) public Integer blockId = null;
    @Tag(tag=4) public Integer sceneId = null;
    @Tag(tag=5) public Integer slotId = null;
    @Tag(tag=11) public String shareCode = null;
    @Tag(tag=3) public Boolean isAllowCopy = null;
    @Tag(tag=6) public Integer createTime = null;
}
