package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class TakeCityReputationExploreRewardRsp {
    public enum TakeCityReputationExploreRewardRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2813) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public Integer cityId = null;
    @Tag(tag=2) public List<Integer> exploreIdList = new ArrayList<>();
    @Tag(tag=12,isSigned=true) public Integer retcode = null;
    @Tag(tag=11) public List<ItemParam> itemList = new ArrayList<>();
}
