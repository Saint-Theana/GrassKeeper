package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class TakeCityReputationLevelRewardRsp {
    public enum TakeCityReputationLevelRewardRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2898) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10,isSigned=true) public Integer retcode = null;
    @Tag(tag=12) public List<ItemParam> itemList = new ArrayList<>();
    @Tag(tag=8) public Integer cityId = null;
    @Tag(tag=11) public Integer level = null;
}
