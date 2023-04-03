package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class ActivityTakeWatcherRewardBatchRsp {
    public enum ActivityTakeWatcherRewardBatchRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2186) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12) public Integer activityId = null;
    @Tag(tag=9) public List<Integer> watcherIdList = new ArrayList<>();
    @Tag(tag=8) public List<ItemParam> itemList = new ArrayList<>();
    @Tag(tag=15,isSigned=true) public Integer retcode = null;
}
