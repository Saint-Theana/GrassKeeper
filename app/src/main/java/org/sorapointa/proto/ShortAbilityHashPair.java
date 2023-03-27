package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ShortAbilityHashPair {
    @Tag(tag=6,isSigned=true) public Integer abilityNameHash = null;
    @Tag(tag=10,isSigned=true) public Integer abilityConfigHash = null;
}
