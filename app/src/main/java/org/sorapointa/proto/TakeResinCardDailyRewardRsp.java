package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class TakeResinCardDailyRewardRsp {
    public enum TakeResinCardDailyRewardRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4116) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public List<ItemParam> itemVec = new ArrayList<>();
    @Tag(tag=4) public Integer productConfigId = null;
    @Tag(tag=9,isSigned=true) public Integer retcode = null;
}
