package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGOperationPlayCard {
    @Tag(tag=12) public Integer cardGuid = null;
    @Tag(tag=4) public List<Integer> costDiceIndexList = new ArrayList<>();
    @Tag(tag=10) public List<Integer> targetCardGuidList = new ArrayList<>();
}
