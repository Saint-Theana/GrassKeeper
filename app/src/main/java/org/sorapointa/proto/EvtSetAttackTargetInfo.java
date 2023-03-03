package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EvtSetAttackTargetInfo {
    @Tag(tag=11) public Integer entityId = null;
    @Tag(tag=6) public Integer selectPointIndex = null;
    @Tag(tag=7) public Integer attackTargetId = null;
}
