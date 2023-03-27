package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WeaponUpgradeRsp {
    public enum WeaponUpgradeRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=700) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5) public Integer curLevel = null;
    @Tag(tag=9) public List<ItemParam> itemParamList = new ArrayList<>();
    @Tag(tag=14,isSigned=true) public Integer retcode = null;
    @Tag(tag=1) public Integer oldLevel = null;
    @Tag(tag=13) public Long targetWeaponGuid = null;
}
