package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GachaUpInfo {
    @Tag(tag=7) public Integer itemParentType = null;
    @Tag(tag=15) public List<Integer> itemIdList = new ArrayList<>();
}
