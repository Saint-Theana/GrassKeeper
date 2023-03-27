package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PSNBlackListNotify {
    public enum PSNBlackListNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4001) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10) public List<FriendBrief> psnBlacklist = new ArrayList<>();
}
