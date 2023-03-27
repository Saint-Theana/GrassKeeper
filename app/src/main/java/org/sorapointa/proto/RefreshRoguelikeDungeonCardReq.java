package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RefreshRoguelikeDungeonCardReq {
    public enum RefreshRoguelikeDungeonCardReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8070) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

}
