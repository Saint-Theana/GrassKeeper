package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DiceReroll {
    @Tag(tag=8) public Integer controllerId = null;
    @Tag(tag=7) public List<Integer> diceSideList = new ArrayList<>();
    @Tag(tag=13) public List<Integer> selectDiceIndexList = new ArrayList<>();
}
