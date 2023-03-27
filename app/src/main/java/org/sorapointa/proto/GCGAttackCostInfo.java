package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGAttackCostInfo {
    @Tag(tag=6) public List<Uint32Pair> costMap = new ArrayList<>();
    @Tag(tag=13) public Integer skillId = null;
}
