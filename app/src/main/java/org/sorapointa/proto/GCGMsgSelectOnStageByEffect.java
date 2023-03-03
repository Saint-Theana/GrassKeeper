package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGMsgSelectOnStageByEffect {
    @Tag(tag=12) public Integer skillId = null;
    @Tag(tag=15) public Integer controllerId = null;
    @Tag(tag=1) public Integer cardGuid = null;
}
