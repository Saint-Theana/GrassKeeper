package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WinterCampGetCanGiveFriendItemRsp {
    public enum WinterCampGetCanGiveFriendItemRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8330) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2,isSigned=true) public Integer retcode = null;
    @Tag(tag=1) public List<ItemParam> itemList = new ArrayList<>();
}
