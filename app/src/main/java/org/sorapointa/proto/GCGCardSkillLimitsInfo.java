package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGSkillLimitsInfo.*;
import org.sorapointa.proto.GCGSkillLimitsInfo;

public class GCGCardSkillLimitsInfo {
    @Tag(tag=13) public List<GCGSkillLimitsInfo> skillLimitsList = new ArrayList<>();
}
