package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGPVEIntention {
    @Tag(tag=9) public Integer cardGuid = null;
    @Tag(tag=7) public List<Integer> skillIdList = new ArrayList<>();
}
