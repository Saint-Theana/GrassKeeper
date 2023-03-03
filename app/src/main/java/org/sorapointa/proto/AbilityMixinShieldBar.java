package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AbilityMixinShieldBar {
    @Tag(tag=14) public Integer playerNum = null;
    @Tag(tag=15,isFloat=true) public Float maxShield = null;
    @Tag(tag=12,isFloat=true) public Float shield = null;
    @Tag(tag=13) public Integer elementType = null;
}
