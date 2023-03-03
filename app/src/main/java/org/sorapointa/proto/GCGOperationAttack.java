package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGOperationAttack {
    @Tag(tag=8) public List<Integer> costDiceIndexList = new ArrayList<>();
    @Tag(tag=2) public Integer skillId = null;
}
