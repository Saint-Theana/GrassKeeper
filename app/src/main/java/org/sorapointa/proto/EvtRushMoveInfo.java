package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class EvtRushMoveInfo {
    @Tag(tag=13) public Vector velocity = null;
    @Tag(tag=5) public Integer entityId = null;
    @Tag(tag=6) public Vector rushAttackTargetPos = null;
    @Tag(tag=10,isFloat=true) public Float timeRange = null;
    @Tag(tag=9,isSigned=true) public Integer faceAngleCompact = null;
    @Tag(tag=14) public Vector pos = null;
    @Tag(tag=8) public Vector rushToPos = null;
    @Tag(tag=7,isSigned=true) public Integer stateNameHash = null;
}
