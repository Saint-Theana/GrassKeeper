package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AbilityMetaTriggerElementReaction {
    @Tag(tag=5,isSigned=true) public Integer hitIndex = null;
    @Tag(tag=6) public Integer elementReactionType = null;
    @Tag(tag=11) public Integer elementSourceType = null;
    @Tag(tag=10) public Integer triggerEntityId = null;
    @Tag(tag=15) public Integer elementReactorType = null;
}
