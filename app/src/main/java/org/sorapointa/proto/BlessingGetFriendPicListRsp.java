package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BlessingGetFriendPicListRsp {
    public enum BlessingGetFriendPicListRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2102) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12) public List<BlessingFriendPicData> friendPicDataList = new ArrayList<>();
    @Tag(tag=2,isSigned=true) public Integer retcode = null;
}
