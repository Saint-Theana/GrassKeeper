package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class OpPlayCard {
    @Tag(tag=6) public Integer replaceCardGuid = null;
    @Tag(tag=11) public List<Integer> targetCardGuidList = new ArrayList<>();
    @Tag(tag=14) public Integer cardGuid = null;
    @Tag(tag=13) public List<Integer> costDiceIndexList = new ArrayList<>();
}
