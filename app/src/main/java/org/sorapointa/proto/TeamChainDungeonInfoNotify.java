package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TeamChainDungeonInfoNotify {
    public enum NIJONKEJPPP {
        @Tag(tag=0) None ,
        @Tag(tag=20331) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12) public List<Integer> skillNoList = new ArrayList<>();
    @Tag(tag=11) public Integer stageId = null;
}
