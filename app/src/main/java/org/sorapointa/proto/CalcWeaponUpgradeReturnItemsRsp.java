package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class CalcWeaponUpgradeReturnItemsRsp {
    public enum CalcWeaponUpgradeReturnItemsRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=660) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4,isSigned=true) public Integer retcode = null;
    @Tag(tag=9) public Long targetWeaponGuid = null;
    @Tag(tag=7) public List<ItemParam> itemParamList = new ArrayList<>();
}
