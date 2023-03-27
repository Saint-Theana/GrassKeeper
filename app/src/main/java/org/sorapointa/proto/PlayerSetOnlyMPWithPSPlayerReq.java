package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerSetOnlyMPWithPSPlayerReq {
    public enum PlayerSetOnlyMPWithPSPlayerReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1802) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=6) public Boolean isOnly = null;
}
