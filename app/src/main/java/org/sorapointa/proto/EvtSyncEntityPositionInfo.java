package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class EvtSyncEntityPositionInfo {
    @Tag(tag=10) public Integer entityId = null;
    @Tag(tag=13) public Integer normalizedTimeCompact = null;
    @Tag(tag=8) public Integer stateHash = null;
    @Tag(tag=7,isSigned=true) public Integer faceAngleCompact = null;
    @Tag(tag=15) public Vector pos = null;
}
