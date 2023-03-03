package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EnterFungusFighterPlotDungeonReq {
    @Tag(tag=14) public Integer dungeonId = null;
    @Tag(tag=8) public List<Integer> fungusIdList = new ArrayList<>();
}
