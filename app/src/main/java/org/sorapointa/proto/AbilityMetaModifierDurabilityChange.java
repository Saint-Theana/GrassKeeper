package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AbilityMetaModifierDurabilityChange {
    @Tag(tag=14,isFloat=true) public Float remainDurability = null;
    @Tag(tag=7,isFloat=true) public Float reduceDurability = null;
}
