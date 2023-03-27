package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGPlayCardCostInfo {
    @Tag(tag=3) public Integer cardId = null;
    @Tag(tag=10) public List<Uint32Pair> costMap = new ArrayList<>();
}
