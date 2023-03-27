package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EvtSetAttackTargetInfo {
    @Tag(tag=14) public Integer entityId = null;
    @Tag(tag=8) public Integer attackTargetId = null;
    @Tag(tag=4) public Integer selectPointIndex = null;
}
