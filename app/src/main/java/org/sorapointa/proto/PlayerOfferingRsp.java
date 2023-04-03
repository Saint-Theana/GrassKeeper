package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PlayerOfferingData.*;
import org.sorapointa.proto.PlayerOfferingData;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class PlayerOfferingRsp {
    public enum PlayerOfferingRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2916) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=1,isSigned=true) public Integer retcode = null;
    @Tag(tag=15) public PlayerOfferingData offeringData = null;
    @Tag(tag=14) public List<ItemParam> itemList = new ArrayList<>();
}
