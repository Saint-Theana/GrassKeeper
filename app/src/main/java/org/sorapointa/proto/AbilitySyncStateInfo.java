package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AbilitySyncStateInfo {
    @Tag(tag=1) public Boolean isInited = null;
    @Tag(tag=2) public List<AbilityScalarValueEntry> dynamicValueMap = new ArrayList<>();
    @Tag(tag=3) public List<AbilityAppliedAbility> appliedAbilities = new ArrayList<>();
    @Tag(tag=4) public List<AbilityAppliedModifier> appliedModifiers = new ArrayList<>();
    @Tag(tag=5) public List<AbilityMixinRecoverInfo> mixinRecoverInfos = new ArrayList<>();
    @Tag(tag=6) public List<AbilityScalarValueEntry> sgvDynamicValueMap = new ArrayList<>();
}
