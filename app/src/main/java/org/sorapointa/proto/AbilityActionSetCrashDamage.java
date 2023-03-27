package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AbilityActionSetCrashDamage {
    @Tag(tag=10) public Vector hitPos = null;
    @Tag(tag=4,isFloat=true) public Float damage = null;
}
