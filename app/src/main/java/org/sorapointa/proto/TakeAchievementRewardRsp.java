package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class TakeAchievementRewardRsp {
    public enum TakeAchievementRewardRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2691) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public List<ItemParam> itemList = new ArrayList<>();
    @Tag(tag=4) public List<Integer> idList = new ArrayList<>();
    @Tag(tag=13,isSigned=true) public Integer retcode = null;
}
