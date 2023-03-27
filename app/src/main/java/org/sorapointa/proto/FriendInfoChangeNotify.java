package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FriendInfoChangeNotify {
    public enum FriendInfoChangeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4026) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2) public String onlineId = null;
    @Tag(tag=9) public Integer uid = null;
}
