package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class EvtSyncEntityPositionInfo {
    @Tag(tag=12) public Integer entityId = null;
    @Tag(tag=7) public Integer stateHash = null;
    @Tag(tag=2) public Vector pos = null;
    @Tag(tag=3,isSigned=true) public Integer faceAngleCompact = null;
    @Tag(tag=1) public Integer normalizedTimeCompact = null;
}
