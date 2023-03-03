package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGMsgPVEGenCardOp {
    @Tag(tag=1) public List<Integer> skillIdList = new ArrayList<>();
    @Tag(tag=11) public Integer cardGuid = null;
}
