package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AbilityIdentifier {
    @Tag(tag=2) public Integer modifierOwnerId = null;
    @Tag(tag=9) public Integer instancedModifierId = null;
    @Tag(tag=10) public Integer instancedAbilityId = null;
    @Tag(tag=6) public Boolean isServerbuffModifier = null;
    @Tag(tag=15) public Integer abilityCasterId = null;
    @Tag(tag=3,isSigned=true) public Integer localId = null;
}
