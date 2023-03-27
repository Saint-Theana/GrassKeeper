package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CostRevise {
    @Tag(tag=15) public Integer controllerId = null;
    @Tag(tag=10) public GCGCostReviseInfo costRevise = null;
}
