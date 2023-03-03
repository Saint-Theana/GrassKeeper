package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class EvtCombatSteerMotionInfo {
    @Tag(tag=12) public Vector pos = null;
    @Tag(tag=10) public Vector velocity = null;
    @Tag(tag=4) public Integer entityId = null;
    @Tag(tag=1) public Vector faceDir = null;
}
