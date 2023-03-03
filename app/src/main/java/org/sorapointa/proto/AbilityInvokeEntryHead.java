package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AbilityInvokeEntryHead {
    @Tag(tag=7,isSigned=true) public Integer modifierConfigLocalId = null;
    @Tag(tag=2) public Boolean isServerbuffModifier = null;
    @Tag(tag=1) public Integer instancedAbilityId = null;
    @Tag(tag=12) public Integer instancedModifierId = null;
    @Tag(tag=10,isSigned=true) public Integer localId = null;
    @Tag(tag=14) public Integer serverBuffUid = null;
    @Tag(tag=3) public Integer targetId = null;
}
