package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ShortAbilityHashPair {
    @Tag(tag=15,isFixed=true,isSigned=true) public Integer abilityConfigHash = null;
    @Tag(tag=1,isFixed=true,isSigned=true) public Integer abilityNameHash = null;
}
