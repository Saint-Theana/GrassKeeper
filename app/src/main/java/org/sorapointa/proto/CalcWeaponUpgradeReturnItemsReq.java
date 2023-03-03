package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class CalcWeaponUpgradeReturnItemsReq {
    @Tag(tag=15) public List<Long> foodWeaponGuidList = new ArrayList<>();
    @Tag(tag=12) public Long targetWeaponGuid = null;
    @Tag(tag=3) public List<ItemParam> itemParamList = new ArrayList<>();
}
