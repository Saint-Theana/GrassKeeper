package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AbilityMixinUGCTimeControl {
    @Tag(tag=13) public Long startMoveTimeMs = null;
    @Tag(tag=3) public Integer startMoveTime = null;
}
