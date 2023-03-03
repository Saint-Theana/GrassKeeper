package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class TakeResinCardDailyRewardRsp {
    @Tag(tag=6) public List<ItemParam> itemVec = new ArrayList<>();
    @Tag(tag=4,isSigned=true) public Integer retcode = null;
    @Tag(tag=12) public Integer productConfigId = null;
}
