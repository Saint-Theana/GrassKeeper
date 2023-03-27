package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DiceRoll {
    @Tag(tag=8) public Integer controllerId = null;
    @Tag(tag=11) public Integer diceNum = null;
    @Tag(tag=7) public List<Integer> diceSideList = new ArrayList<>();
}
