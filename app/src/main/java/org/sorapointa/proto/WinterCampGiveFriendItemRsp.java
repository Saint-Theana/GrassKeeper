package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WinterCampGiveFriendItemRsp {
    public enum WinterCampGiveFriendItemRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8656) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public List<Integer> limitItemIdList = new ArrayList<>();
    @Tag(tag=15,isSigned=true) public Integer retcode = null;
}
