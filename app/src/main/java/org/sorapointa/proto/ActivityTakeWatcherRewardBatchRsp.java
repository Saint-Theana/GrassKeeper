package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class ActivityTakeWatcherRewardBatchRsp {
    @Tag(tag=6) public List<Integer> watcherIdList = new ArrayList<>();
    @Tag(tag=15,isSigned=true) public Integer retcode = null;
    @Tag(tag=7) public Integer activityId = null;
    @Tag(tag=1) public List<ItemParam> itemList = new ArrayList<>();
}
