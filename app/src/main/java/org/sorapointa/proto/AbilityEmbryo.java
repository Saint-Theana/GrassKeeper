package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AbilityEmbryo {
    @Tag(tag=1) public Integer abilityId = null;
    @Tag(tag=2) public Integer abilityNameHash = null;
    @Tag(tag=3) public Integer abilityOverrideNameHash = null;
}
