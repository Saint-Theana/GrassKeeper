package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGSkillPreviewInfo.*;
import org.sorapointa.proto.GCGSkillPreviewInfo;

public class GCGSkillPreviewNotify {
    @Tag(tag=9) public List<GCGSkillPreviewInfo> skillPreviewList = new ArrayList<>();
    @Tag(tag=5) public Integer onstageCardGuid = null;
    @Tag(tag=15) public Integer controllerId = null;
}
