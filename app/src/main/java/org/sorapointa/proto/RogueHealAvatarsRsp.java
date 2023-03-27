package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RogueHealAvatarsRsp {
    public enum RogueHealAvatarsRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8803) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14,isSigned=true) public Integer retcode = null;
    @Tag(tag=12) public Integer cellId = null;
    @Tag(tag=11) public Integer dungeonId = null;
}
