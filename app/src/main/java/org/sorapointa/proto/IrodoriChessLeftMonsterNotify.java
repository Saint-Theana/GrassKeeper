package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class IrodoriChessLeftMonsterNotify {
    public enum IrodoriChessLeftMonsterNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5340) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=6) public Integer leftMonsters = null;
}
