package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AbilityString.*;
import org.sorapointa.proto.AbilityString;

public class AbilityMetaUpdateBaseReactionDamage {
    @Tag(tag=15) public Integer sourceCasterId = null;
    @Tag(tag=1) public AbilityString abilityName = null;
    @Tag(tag=4) public AbilityString globalValueKey = null;
    @Tag(tag=8) public Integer reactionType = null;
}
