package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RogueHealAvatarsReq {
    public enum RogueHealAvatarsReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8538) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=12) public Integer dungeonId = null;
    @Tag(tag=11) public Integer cellId = null;
}
