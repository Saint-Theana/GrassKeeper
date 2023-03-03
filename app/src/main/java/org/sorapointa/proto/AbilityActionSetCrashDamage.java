package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class AbilityActionSetCrashDamage {
    @Tag(tag=2) public Vector hitPos = null;
    @Tag(tag=15,isFloat=true) public Float damage = null;
}
