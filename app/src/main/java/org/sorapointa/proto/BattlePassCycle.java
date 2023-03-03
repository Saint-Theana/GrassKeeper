package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BattlePassCycle {
    @Tag(tag=3) public Integer cycleIdx = null;
    @Tag(tag=10) public Integer endTime = null;
    @Tag(tag=13) public Integer beginTime = null;
}
