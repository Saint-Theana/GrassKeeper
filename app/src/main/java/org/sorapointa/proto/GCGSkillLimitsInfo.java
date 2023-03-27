package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGSkillLimitsInfo {
    @Tag(tag=8) public List<GCGLimitsInfo> limitsList = new ArrayList<>();
    @Tag(tag=9) public Integer skillId = null;
}
