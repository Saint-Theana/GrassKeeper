package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class TakeCityReputationLevelRewardRsp {
    @Tag(tag=15) public Integer cityId = null;
    @Tag(tag=11,isSigned=true) public Integer retcode = null;
    @Tag(tag=13) public List<ItemParam> itemList = new ArrayList<>();
    @Tag(tag=9) public Integer level = null;
}
