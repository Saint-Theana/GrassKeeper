package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class OpAttack {
    @Tag(tag=8) public Integer skillId = null;
    @Tag(tag=11) public List<Integer> costDiceIndexList = new ArrayList<>();
}
