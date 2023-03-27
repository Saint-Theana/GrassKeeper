package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TakeOfferingLevelRewardRsp {
    public enum TakeOfferingLevelRewardRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2907) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7,isSigned=true) public Integer retcode = null;
    @Tag(tag=14) public Integer offeringId = null;
    @Tag(tag=1) public Integer takeLevel = null;
    @Tag(tag=10) public List<ItemParam> itemList = new ArrayList<>();
}
