package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChessLeftMonstersNotify {
    public enum ChessLeftMonstersNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5377) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8) public Integer leftMonsters = null;
}
