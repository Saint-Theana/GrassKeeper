package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class WeaponUpgradeReq {
    @Tag(tag=1) public List<Long> foodWeaponGuidList = new ArrayList<>();
    @Tag(tag=15) public List<ItemParam> itemParamList = new ArrayList<>();
    @Tag(tag=4) public Long targetWeaponGuid = null;
}
