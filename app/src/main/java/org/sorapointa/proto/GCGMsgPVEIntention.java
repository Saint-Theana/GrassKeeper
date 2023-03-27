package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGMsgPVEIntention {
    @Tag(tag=3) public List<Integer> skillIdList = new ArrayList<>();
    @Tag(tag=9) public Integer cardGuid = null;
}
