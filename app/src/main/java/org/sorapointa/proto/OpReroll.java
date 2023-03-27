package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class OpReroll {
    @Tag(tag=3) public List<Integer> diceIndexList = new ArrayList<>();
}
