package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TakeBattlePassMissionPointRsp {
    public enum TakeBattlePassMissionPointRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2635) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10) public List<Integer> missionIdList = new ArrayList<>();
    @Tag(tag=4,isSigned=true) public Integer retcode = null;
}
