package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AbilityString.*;
import org.sorapointa.proto.AbilityString;

public class AbilityMetaAddOrGetAbilityAndTrigger {
    @Tag(tag=4) public AbilityString abilityOverride = null;
    @Tag(tag=15,isFloat=true) public Float triggerArgument = null;
    @Tag(tag=6) public AbilityString abilityName = null;
}
