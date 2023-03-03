package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class TakeAchievementGoalRewardRsp {
    @Tag(tag=15,isSigned=true) public Integer retcode = null;
    @Tag(tag=12) public List<Integer> idList = new ArrayList<>();
    @Tag(tag=5) public List<ItemParam> itemList = new ArrayList<>();
}
