package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EvtSyncSkillAnchorPosition {
    @Tag(tag=7) public Integer entityId = null;
    @Tag(tag=9) public Vector skillAnchorPosition = null;
}
