package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class TakeCityReputationExploreRewardRsp {
    @Tag(tag=8) public List<Integer> exploreIdList = new ArrayList<>();
    @Tag(tag=12) public List<ItemParam> itemList = new ArrayList<>();
    @Tag(tag=6,isSigned=true) public Integer retcode = null;
    @Tag(tag=13) public Integer cityId = null;
}
