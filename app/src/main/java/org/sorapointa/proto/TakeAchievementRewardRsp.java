package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class TakeAchievementRewardRsp {
    @Tag(tag=7) public List<Integer> idList = new ArrayList<>();
    @Tag(tag=10) public List<ItemParam> itemList = new ArrayList<>();
    @Tag(tag=1,isSigned=true) public Integer retcode = null;
}
