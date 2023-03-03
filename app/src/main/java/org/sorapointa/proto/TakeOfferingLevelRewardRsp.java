package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class TakeOfferingLevelRewardRsp {
    @Tag(tag=3) public Integer offeringId = null;
    @Tag(tag=4) public Integer takeLevel = null;
    @Tag(tag=8,isSigned=true) public Integer retcode = null;
    @Tag(tag=2) public List<ItemParam> itemList = new ArrayList<>();
}
