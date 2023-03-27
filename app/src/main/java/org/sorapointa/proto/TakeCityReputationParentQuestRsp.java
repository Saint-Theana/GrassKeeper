package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TakeCityReputationParentQuestRsp {
    public enum TakeCityReputationParentQuestRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2880) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=14) public List<Integer> parentQuestList = new ArrayList<>();
    @Tag(tag=6,isSigned=true) public Integer retcode = null;
    @Tag(tag=13) public Integer cityId = null;
    @Tag(tag=11) public List<ItemParam> itemList = new ArrayList<>();
}
