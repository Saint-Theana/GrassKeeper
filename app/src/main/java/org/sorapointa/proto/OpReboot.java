package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class OpReboot {
    @Tag(tag=9) public List<Integer> costCardGuidList = new ArrayList<>();
    @Tag(tag=10) public List<Integer> diceIndexList = new ArrayList<>();
}
