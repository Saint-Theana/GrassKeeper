package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Uint32Pair.*;
import org.sorapointa.proto.Uint32Pair;

public class GCGSelectOnStageCostInfo {
    @Tag(tag=14) public Integer cardGuid = null;
    @Tag(tag=10) public List<Uint32Pair> costMap = new ArrayList<>();
}
