package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BlessingRecvFriendPicNotify {
    public enum BlessingRecvFriendPicNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2159) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public Integer uid = null;
    @Tag(tag=14) public Integer picId = null;
}
