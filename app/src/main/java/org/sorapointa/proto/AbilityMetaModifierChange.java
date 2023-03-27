package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AbilityMetaModifierChange {
    @Tag(tag=8) public Integer applyEntityId = null;
    @Tag(tag=7) public AbilityAttachedModifier attachedInstancedModifier = null;
    @Tag(tag=1) public Boolean isDurabilityZero = null;
    @Tag(tag=13) public List<ModifierProperty> properties = new ArrayList<>();
    @Tag(tag=10) public AbilityString parentAbilityName = null;
    @Tag(tag=5) public AbilityString parentAbilityOverride = null;
    @Tag(tag=11) public Boolean isMuteRemote = null;
    @Tag(tag=3) public Boolean isAttachedParentAbility = null;
    @Tag(tag=9) public Integer serverBuffUid = null;
    @Tag(tag=6,isSigned=true) public Integer modifierLocalId = null;
    @Tag(tag=2) public Integer action = null;
}
