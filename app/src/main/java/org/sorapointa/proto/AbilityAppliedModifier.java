package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AbilityAttachedModifier.*;
import org.sorapointa.proto.AbilityAttachedModifier;
import org.sorapointa.proto.AbilityString.*;
import org.sorapointa.proto.AbilityString;
import org.sorapointa.proto.ModifierDurability.*;
import org.sorapointa.proto.ModifierDurability;

public class AbilityAppliedModifier {
    @Tag(tag=1,isSigned=true) public Integer modifierLocalId = null;
    @Tag(tag=2) public Integer parentAbilityEntityId = null;
    @Tag(tag=3) public AbilityString parentAbilityName = null;
    @Tag(tag=4) public AbilityString parentAbilityOverride = null;
    @Tag(tag=5) public Integer instancedAbilityId = null;
    @Tag(tag=6) public Integer instancedModifierId = null;
    @Tag(tag=7,isFloat=true) public Float existDuration = null;
    @Tag(tag=8) public AbilityAttachedModifier attachedInstancedModifier = null;
    @Tag(tag=9) public Integer applyEntityId = null;
    @Tag(tag=10) public Boolean isAttachedParentAbility = null;
    @Tag(tag=11) public ModifierDurability modifierDurability = null;
    @Tag(tag=12) public Integer sbuffUid = null;
    @Tag(tag=13) public Boolean isServerbuffModifier = null;
}
