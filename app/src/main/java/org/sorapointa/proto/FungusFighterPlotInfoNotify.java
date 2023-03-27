package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FungusFighterPlotInfoNotify {
    public enum MDJGOPHLFOJ {
        @Tag(tag=0) None ,
        @Tag(tag=24391) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=1) public List<Integer> fungusIdList = new ArrayList<>();
    @Tag(tag=12) public Integer dungeonId = null;
}
