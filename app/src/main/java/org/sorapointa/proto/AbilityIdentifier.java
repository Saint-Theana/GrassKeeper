package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AbilityIdentifier {
    @Tag(tag=3) public Integer modifierOwnerId = null;
    @Tag(tag=10) public Integer abilityCasterId = null;
    @Tag(tag=5) public Integer instancedAbilityId = null;
    @Tag(tag=4) public Boolean isServerbuffModifier = null;
    @Tag(tag=8,isSigned=true) public Integer localId = null;
    @Tag(tag=11) public Integer instancedModifierId = null;
}
