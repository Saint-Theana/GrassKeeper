package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DungeonRestartRsp {
    public enum DungeonRestartRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=956) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=6) public Integer dungeonId = null;
    @Tag(tag=4,isSigned=true) public Integer retcode = null;
    @Tag(tag=1) public Integer pointId = null;
}
