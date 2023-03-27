package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BlessingRedeemRewardRsp {
    public static class MapPicNumMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public enum BlessingRedeemRewardRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2104) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2,isSigned=true) public Integer retcode = null;
    @Tag(tag=6) public List<MapPicNumMap> picNumMap = new ArrayList<>();
}
