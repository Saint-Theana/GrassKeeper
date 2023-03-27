package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BreakoutPhysicalObject {
    @Tag(tag=1) public Integer id = null;
    @Tag(tag=2) public Integer index = null;
    @Tag(tag=3) public Boolean isActive = null;
    @Tag(tag=4) public BreakoutVector2 pos = null;
    @Tag(tag=5) public BreakoutVector2 moveDir = null;
    @Tag(tag=6,isSigned=true) public Integer speed = null;
    @Tag(tag=7) public Integer initPeerId = null;
    @Tag(tag=8) public Integer state = null;
    @Tag(tag=9) public Integer elementType = null;
    @Tag(tag=10) public Integer elementReactionBuff = null;
    @Tag(tag=11) public List<BreakoutPhysicalObjectModifier> modifierList = new ArrayList<>();
    @Tag(tag=12,isSigned=true) public Integer totalRotation = null;
    @Tag(tag=13) public List<BreakoutBrickInfo> infoList = new ArrayList<>();
    @Tag(tag=14) public Integer lastHitPeerId = null;
    @Tag(tag=15) public Integer speedIncreaseCount = null;
    @Tag(tag=16,isSigned=true) public Integer offset = null;
}
