package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class OpSelectOnStage {
    @Tag(tag=6) public Integer cardGuid = null;
    @Tag(tag=13) public List<Integer> costDiceIndexList = new ArrayList<>();
}
