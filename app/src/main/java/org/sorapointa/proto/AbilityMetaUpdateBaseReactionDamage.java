package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AbilityString.*;
import org.sorapointa.proto.AbilityString;

public class AbilityMetaUpdateBaseReactionDamage {
    @Tag(tag=12) public Integer reactionType = null;
    @Tag(tag=13) public AbilityString globalValueKey = null;
    @Tag(tag=11) public AbilityString abilityName = null;
    @Tag(tag=14) public Integer sourceCasterId = null;
}
