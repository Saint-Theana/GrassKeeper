package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AbilityMixinElementShield {
    @Tag(tag=2,isFloat=true) public Float shield = null;
    @Tag(tag=8,isFloat=true) public Float maxShield = null;
    @Tag(tag=12) public Boolean isShieldBroken = null;
    @Tag(tag=13,isFloat=true) public Float subShield = null;
    @Tag(tag=15) public Integer playerNum = null;
    @Tag(tag=1) public Integer absorbType = null;
}
