package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EnterFungusFighterPlotDungeonReq {
    public enum EGEAFDPOHND {
        @Tag(tag=0) None ,
        @Tag(tag=23842) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=11) public Integer dungeonId = null;
    @Tag(tag=6) public List<Integer> fungusIdList = new ArrayList<>();
}
