package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AbilityString.*;
import org.sorapointa.proto.AbilityString;
import org.sorapointa.proto.AbilityScalarValueEntry.*;
import org.sorapointa.proto.AbilityScalarValueEntry;

public class AbilityAppliedAbility {
    @Tag(tag=1) public AbilityString abilityName = null;
    @Tag(tag=2) public AbilityString abilityOverride = null;
    @Tag(tag=3) public List<AbilityScalarValueEntry> overrideMap = new ArrayList<>();
    @Tag(tag=4) public Integer instancedAbilityId = null;
}
