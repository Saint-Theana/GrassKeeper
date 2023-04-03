package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Uint32Pair.*;
import org.sorapointa.proto.Uint32Pair;

public class GCGPlayCardCostInfo {
    @Tag(tag=3) public Integer cardId = null;
    @Tag(tag=10) public List<Uint32Pair> costMap = new ArrayList<>();
}
