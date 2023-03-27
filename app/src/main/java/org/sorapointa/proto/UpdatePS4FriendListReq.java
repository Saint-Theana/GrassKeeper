package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class UpdatePS4FriendListReq {
    public enum UpdatePS4FriendListReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4061) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=3) public List<String> psnIdList = new ArrayList<>();
}
