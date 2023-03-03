package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class EvtCompensatePosDiffInfo {
    @Tag(tag=14) public Vector curPos = null;
    @Tag(tag=11) public Integer entityId = null;
    @Tag(tag=10,isSigned=true) public Integer faceAngleCompact = null;
    @Tag(tag=4) public Integer curHash = null;
    @Tag(tag=3) public Integer normalizedTimeCompact = null;
}
