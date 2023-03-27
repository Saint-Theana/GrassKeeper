package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AbilityInvokeEntryHead {
    @Tag(tag=7,isSigned=true) public Integer localId = null;
    @Tag(tag=15) public Integer serverBuffUid = null;
    @Tag(tag=5) public Integer targetId = null;
    @Tag(tag=2) public Integer instancedAbilityId = null;
    @Tag(tag=9) public Integer instancedModifierId = null;
    @Tag(tag=10) public Boolean isServerbuffModifier = null;
    @Tag(tag=8,isSigned=true) public Integer modifierConfigLocalId = null;
}
