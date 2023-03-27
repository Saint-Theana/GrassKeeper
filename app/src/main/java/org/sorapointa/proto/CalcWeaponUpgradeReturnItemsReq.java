package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CalcWeaponUpgradeReturnItemsReq {
    public enum CalcWeaponUpgradeReturnItemsReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=691) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=8) public List<Long> foodWeaponGuidList = new ArrayList<>();
    @Tag(tag=4) public List<ItemParam> itemParamList = new ArrayList<>();
    @Tag(tag=10) public Long targetWeaponGuid = null;
}
