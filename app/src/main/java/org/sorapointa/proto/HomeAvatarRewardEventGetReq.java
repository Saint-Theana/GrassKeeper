package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeAvatarRewardEventGetReq {
    public enum HomeAvatarRewardEventGetReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4692) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=7) public Integer eventId = null;
    @Tag(tag=12) public Integer avatarId = null;
}
