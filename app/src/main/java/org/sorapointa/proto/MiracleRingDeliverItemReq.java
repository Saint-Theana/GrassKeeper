package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.InterOpType.*;
import org.sorapointa.proto.InterOpType;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class MiracleRingDeliverItemReq {
    @Tag(tag=9) public Integer opType = null;
    @Tag(tag=1) public List<ItemParam> itemParamList = new ArrayList<>();
    @Tag(tag=4) public List<Long> foodWeaponGuidList = new ArrayList<>();
    @Tag(tag=14) public Integer gadgetId = null;
    @Tag(tag=5) public Integer gadgetEntityId = null;
}
