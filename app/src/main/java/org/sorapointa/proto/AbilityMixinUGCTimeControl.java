package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AbilityMixinUGCTimeControl {
    @Tag(tag=6) public Integer startMoveTime = null;
    @Tag(tag=5) public Long startMoveTimeMs = null;
}
