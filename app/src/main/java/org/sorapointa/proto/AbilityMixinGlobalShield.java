package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AbilityMixinGlobalShield {
    @Tag(tag=4) public Boolean isCreateEffect = null;
    @Tag(tag=7,isFloat=true) public Float subShield = null;
    @Tag(tag=5,isFloat=true) public Float heightOffset = null;
    @Tag(tag=11) public Integer avatarId = null;
    @Tag(tag=10,isFloat=true) public Float maxShield = null;
    @Tag(tag=2) public String shieldEffectName = null;
}
