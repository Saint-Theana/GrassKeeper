package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGSkillPreviewTokenInfo.*;
import org.sorapointa.proto.GCGSkillPreviewTokenInfo;

public class GCGSkillPreviewTokenChangeInfo {
    @Tag(tag=14) public List<GCGSkillPreviewTokenInfo> tokenChangeList = new ArrayList<>();
}
