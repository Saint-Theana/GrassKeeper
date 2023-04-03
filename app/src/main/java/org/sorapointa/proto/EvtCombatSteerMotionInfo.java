package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class EvtCombatSteerMotionInfo {
    @Tag(tag=3) public Vector faceDir = null;
    @Tag(tag=7) public Vector velocity = null;
    @Tag(tag=6) public Integer entityId = null;
    @Tag(tag=4) public Vector pos = null;
}
