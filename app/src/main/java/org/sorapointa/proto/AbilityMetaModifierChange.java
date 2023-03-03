package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AbilityAttachedModifier.*;
import org.sorapointa.proto.AbilityAttachedModifier;
import org.sorapointa.proto.AbilityString.*;
import org.sorapointa.proto.AbilityString;
import org.sorapointa.proto.ModifierAction.*;
import org.sorapointa.proto.ModifierAction;
import org.sorapointa.proto.ModifierProperty.*;
import org.sorapointa.proto.ModifierProperty;

public class AbilityMetaModifierChange {
    @Tag(tag=7) public AbilityAttachedModifier attachedInstancedModifier = null;
    @Tag(tag=4) public Integer serverBuffUid = null;
    @Tag(tag=10) public Boolean isAttachedParentAbility = null;
    @Tag(tag=13) public Integer action = null;
    @Tag(tag=2,isSigned=true) public Integer modifierLocalId = null;
    @Tag(tag=1) public AbilityString parentAbilityName = null;
    @Tag(tag=6) public Boolean isMuteRemote = null;
    @Tag(tag=5) public Integer applyEntityId = null;
    @Tag(tag=3) public List<ModifierProperty> properties = new ArrayList<>();
    @Tag(tag=11) public AbilityString parentAbilityOverride = null;
    @Tag(tag=9) public Boolean isDurabilityZero = null;
}
