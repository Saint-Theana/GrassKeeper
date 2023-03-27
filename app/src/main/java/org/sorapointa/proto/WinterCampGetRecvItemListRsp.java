package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WinterCampGetRecvItemListRsp {
    public enum WinterCampGetRecvItemListRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8073) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public List<WinterCampRecvItemData> recvItemDataList = new ArrayList<>();
    @Tag(tag=11,isSigned=true) public Integer retcode = null;
}
