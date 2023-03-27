package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AbilityMixinGlobalShield {
    @Tag(tag=13) public Boolean isCreateEffect = null;
    @Tag(tag=2,isFloat=true) public Float subShield = null;
    @Tag(tag=6,isFloat=true) public Float heightOffset = null;
    @Tag(tag=7) public Integer avatarId = null;
    @Tag(tag=5) public String shieldEffectName = null;
    @Tag(tag=3,isFloat=true) public Float maxShield = null;
}
