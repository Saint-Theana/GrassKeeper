package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CostDice {
    @Tag(tag=7) public Integer reason = null;
    @Tag(tag=9) public Integer controllerId = null;
    @Tag(tag=8) public List<Integer> selectDiceIndexList = new ArrayList<>();
}