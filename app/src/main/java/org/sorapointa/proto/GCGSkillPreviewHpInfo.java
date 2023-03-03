package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGSkillHpChangeType.*;
import org.sorapointa.proto.GCGSkillHpChangeType;

public class GCGSkillPreviewHpInfo {
    @Tag(tag=4) public Integer changeType = null;
    @Tag(tag=13) public Integer hpChangeValue = null;
}
