package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeKickPlayerReq {
    public enum HomeKickPlayerReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4511) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=7) public Boolean isKickAll = null;
    @Tag(tag=15) public Integer targetUid = null;
}
