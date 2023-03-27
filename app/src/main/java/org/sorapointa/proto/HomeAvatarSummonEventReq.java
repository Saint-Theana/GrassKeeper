package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeAvatarSummonEventReq {
    public enum HomeAvatarSummonEventReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4880) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=7) public Integer guid = null;
    @Tag(tag=11) public Integer avatarId = null;
    @Tag(tag=2) public Integer suitId = null;
}
