package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TakeCityReputationParentQuestReq {
    public enum TakeCityReputationParentQuestReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2874) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=1) public List<Integer> parentQuestList = new ArrayList<>();
    @Tag(tag=9) public Integer cityId = null;
}
