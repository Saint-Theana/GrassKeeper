package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChessEscapedMonstersNotify {
    public enum ChessEscapedMonstersNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5312) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10) public Integer excapedMonsters = null;
}
