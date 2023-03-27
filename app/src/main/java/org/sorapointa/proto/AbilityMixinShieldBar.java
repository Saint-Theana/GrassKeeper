package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AbilityMixinShieldBar {
    @Tag(tag=8,isFloat=true) public Float shield = null;
    @Tag(tag=11,isFloat=true) public Float maxShield = null;
    @Tag(tag=1) public Integer elementType = null;
    @Tag(tag=7) public Integer playerNum = null;
}
