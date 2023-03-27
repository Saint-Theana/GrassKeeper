package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TakeBattlePassMissionPointReq {
    public enum TakeBattlePassMissionPointReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2631) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=5) public List<Integer> missionIdList = new ArrayList<>();
}
