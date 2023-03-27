package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AbilityMetaElementReactionVisual {
    @Tag(tag=3) public Integer elementSourceType = null;
    @Tag(tag=12,isSigned=true) public Integer hitIndex = null;
    @Tag(tag=2) public Integer elementReactorType = null;
    @Tag(tag=7) public Integer elementReactionType = null;
}
