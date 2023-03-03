package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AbilityAttachedModifier {
    @Tag(tag=1) public Boolean isInvalid = null;
    @Tag(tag=2) public Integer ownerEntityId = null;
    @Tag(tag=3) public Integer instancedModifierId = null;
    @Tag(tag=4) public Boolean isServerbuffModifier = null;
    @Tag(tag=5,isSigned=true) public Integer attachNameHash = null;
}
