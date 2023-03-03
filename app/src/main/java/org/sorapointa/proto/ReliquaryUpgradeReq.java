package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class ReliquaryUpgradeReq {
    @Tag(tag=11) public List<ItemParam> itemParamList = new ArrayList<>();
    @Tag(tag=6) public Long targetReliquaryGuid = null;
    @Tag(tag=12) public List<Long> foodReliquaryGuidList = new ArrayList<>();
}
