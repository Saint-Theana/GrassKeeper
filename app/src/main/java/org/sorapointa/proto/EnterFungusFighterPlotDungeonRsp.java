package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EnterFungusFighterPlotDungeonRsp {
    public enum BJGOKLGJCHD {
        @Tag(tag=0) None ,
        @Tag(tag=23496) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=3,isSigned=true) public Integer retcode = null;
    @Tag(tag=13) public List<Integer> fungusIdList = new ArrayList<>();
    @Tag(tag=4) public Integer dungeonId = null;
}
