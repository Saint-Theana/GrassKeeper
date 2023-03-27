package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeBlueprintSlotInfo {
    @Tag(tag=9) public Boolean isAllowCopy = null;
    @Tag(tag=8) public Integer createTime = null;
    @Tag(tag=3) public Integer sceneId = null;
    @Tag(tag=2) public Integer blockId = null;
    @Tag(tag=12) public Integer slotId = null;
    @Tag(tag=1) public Integer moduleId = null;
    @Tag(tag=4) public String shareCode = null;
}
