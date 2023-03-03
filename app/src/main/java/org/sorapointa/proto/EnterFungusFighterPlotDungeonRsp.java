package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EnterFungusFighterPlotDungeonRsp {
    @Tag(tag=10,isSigned=true) public Integer retcode = null;
    @Tag(tag=15) public Integer dungeonId = null;
    @Tag(tag=2) public List<Integer> fungusIdList = new ArrayList<>();
}
