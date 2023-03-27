package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BattlePassCycle {
    @Tag(tag=8) public Integer cycleIdx = null;
    @Tag(tag=2) public Integer beginTime = null;
    @Tag(tag=11) public Integer endTime = null;
}
