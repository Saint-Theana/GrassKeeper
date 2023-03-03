package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AbilityString.*;
import org.sorapointa.proto.AbilityString;

public class AbilityMetaAddOrGetAbilityAndTrigger {
    @Tag(tag=13) public AbilityString abilityName = null;
    @Tag(tag=3,isFloat=true) public Float triggerArgument = null;
    @Tag(tag=8) public AbilityString abilityOverride = null;
}
