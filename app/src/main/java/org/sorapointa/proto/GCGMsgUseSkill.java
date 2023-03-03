package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGMsgUseSkill {
    @Tag(tag=9) public Integer skillId = null;
    @Tag(tag=6) public Integer cardGuid = null;
}
