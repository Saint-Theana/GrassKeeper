package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerStartMatchRsp {
    public enum PlayerStartMatchRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4195) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public Integer matchType = null;
    @Tag(tag=3) public Integer dungeonId = null;
    @Tag(tag=11) public Integer punishEndTime = null;
    @Tag(tag=6,isSigned=true) public Integer retcode = null;
    @Tag(tag=5) public Integer param = null;
    @Tag(tag=2) public Integer matchId = null;
    @Tag(tag=9) public Integer mpPlayId = null;
    @Tag(tag=12) public Integer mechanicusDifficultLevel = null;
}
