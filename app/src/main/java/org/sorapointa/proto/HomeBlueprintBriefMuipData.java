package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeBlueprintBriefMuipData {
    @Tag(tag=1) public String shareCode = null;
    @Tag(tag=2) public Integer ownerUid = null;
    @Tag(tag=3) public Integer moduleId = null;
    @Tag(tag=4) public Integer sceneId = null;
    @Tag(tag=5) public Integer blockId = null;
    @Tag(tag=6) public Boolean isAllowCopy = null;
    @Tag(tag=7) public Integer createTime = null;
}
