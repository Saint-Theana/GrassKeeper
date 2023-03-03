package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class TakeCityReputationParentQuestRsp {
    @Tag(tag=7,isSigned=true) public Integer retcode = null;
    @Tag(tag=14) public Integer cityId = null;
    @Tag(tag=9) public List<Integer> parentQuestList = new ArrayList<>();
    @Tag(tag=13) public List<ItemParam> itemList = new ArrayList<>();
}
