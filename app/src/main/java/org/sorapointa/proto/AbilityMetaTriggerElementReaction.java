package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AbilityMetaTriggerElementReaction {
    @Tag(tag=9,isSigned=true) public Integer hitIndex = null;
    @Tag(tag=7) public Integer elementSourceType = null;
    @Tag(tag=12) public Integer elementReactorType = null;
    @Tag(tag=2) public Integer triggerEntityId = null;
    @Tag(tag=1) public Integer elementReactionType = null;
}
