package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class WeaponUpgradeRsp {
    @Tag(tag=7) public Integer curLevel = null;
    @Tag(tag=11,isSigned=true) public Integer retcode = null;
    @Tag(tag=8) public Integer oldLevel = null;
    @Tag(tag=2) public List<ItemParam> itemParamList = new ArrayList<>();
    @Tag(tag=6) public Long targetWeaponGuid = null;
}
