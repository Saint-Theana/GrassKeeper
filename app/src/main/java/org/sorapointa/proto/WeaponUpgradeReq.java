package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class WeaponUpgradeReq {
    public enum WeaponUpgradeReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=646) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=1) public List<ItemParam> itemParamList = new ArrayList<>();
    @Tag(tag=11) public Long targetWeaponGuid = null;
    @Tag(tag=7) public List<Long> foodWeaponGuidList = new ArrayList<>();
}
