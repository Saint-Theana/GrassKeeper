package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerEnterDungeonRsp {
    public enum PlayerEnterDungeonRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=998) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=1) public Integer pointId = null;
    @Tag(tag=11) public Integer dungeonId = null;
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
}
