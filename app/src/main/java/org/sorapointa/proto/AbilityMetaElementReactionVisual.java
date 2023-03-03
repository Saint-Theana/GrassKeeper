package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AbilityMetaElementReactionVisual {
    @Tag(tag=2,isSigned=true) public Integer hitIndex = null;
    @Tag(tag=12) public Integer elementSourceType = null;
    @Tag(tag=6) public Integer elementReactorType = null;
    @Tag(tag=5) public Integer elementReactionType = null;
}
