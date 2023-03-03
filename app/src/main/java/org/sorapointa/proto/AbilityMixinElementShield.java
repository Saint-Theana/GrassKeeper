package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AbilityMixinElementShield {
    @Tag(tag=10,isFloat=true) public Float subShield = null;
    @Tag(tag=8,isFloat=true) public Float shield = null;
    @Tag(tag=1) public Integer absorbType = null;
    @Tag(tag=4) public Integer playerNum = null;
    @Tag(tag=9) public Boolean isShieldBroken = null;
    @Tag(tag=12,isFloat=true) public Float maxShield = null;
}
