package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetFriendShowNameCardInfoRsp {
    public enum GetFriendShowNameCardInfoRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4056) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=3,isSigned=true) public Integer retcode = null;
    @Tag(tag=2) public Integer uid = null;
    @Tag(tag=15) public List<Integer> showNameCardIdList = new ArrayList<>();
}
