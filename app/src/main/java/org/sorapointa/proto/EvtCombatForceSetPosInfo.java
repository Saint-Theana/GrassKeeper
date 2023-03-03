package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class EvtCombatForceSetPosInfo {
    @Tag(tag=9) public Integer iceId = null;
    @Tag(tag=10) public Integer colliderEntityId = null;
    @Tag(tag=6) public Integer entityId = null;
    @Tag(tag=1) public Vector targetPos = null;
}
