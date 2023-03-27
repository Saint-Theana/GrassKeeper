package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeAvatarRewardEventGetRsp {
    public enum HomeAvatarRewardEventGetRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4534) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15,isSigned=true) public Integer retcode = null;
    @Tag(tag=2) public List<ItemParam> itemList = new ArrayList<>();
    @Tag(tag=6) public Integer eventId = null;
}
