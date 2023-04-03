package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGLimitsInfo.*;
import org.sorapointa.proto.GCGLimitsInfo;

public class GCGSkillLimitsInfo {
    @Tag(tag=8) public List<GCGLimitsInfo> limitsList = new ArrayList<>();
    @Tag(tag=9) public Integer skillId = null;
}
