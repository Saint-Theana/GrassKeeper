package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AbilityMetaModifierDurabilityChange {
    @Tag(tag=6,isFloat=true) public Float reduceDurability = null;
    @Tag(tag=15,isFloat=true) public Float remainDurability = null;
}
