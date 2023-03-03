package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGMsgUseSkillEnd {
    @Tag(tag=11) public Integer cardGuid = null;
    @Tag(tag=12) public Integer skillId = null;
}
