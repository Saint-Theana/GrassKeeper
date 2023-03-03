package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGBasicDataNotify {
    @Tag(tag=9) public Integer level = null;
    @Tag(tag=4) public Integer exp = null;
    @Tag(tag=12) public List<Integer> levelRewardTakenList = new ArrayList<>();
}
