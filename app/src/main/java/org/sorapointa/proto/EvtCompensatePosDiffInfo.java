package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EvtCompensatePosDiffInfo {
    @Tag(tag=2) public Integer entityId = null;
    @Tag(tag=7) public Vector curPos = null;
    @Tag(tag=15) public Integer normalizedTimeCompact = null;
    @Tag(tag=1) public Integer curHash = null;
    @Tag(tag=10,isSigned=true) public Integer faceAngleCompact = null;
}
