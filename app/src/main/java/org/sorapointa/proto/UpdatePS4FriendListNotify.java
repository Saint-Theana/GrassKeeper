package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class UpdatePS4FriendListNotify {
    public enum UpdatePS4FriendListNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4046) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=8) public List<String> psnIdList = new ArrayList<>();
}
