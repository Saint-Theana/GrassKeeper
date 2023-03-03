package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FungusFighterPlotInfoNotify {
    @Tag(tag=11) public List<Integer> fungusIdList = new ArrayList<>();
    @Tag(tag=4) public Integer dungeonId = null;
}
