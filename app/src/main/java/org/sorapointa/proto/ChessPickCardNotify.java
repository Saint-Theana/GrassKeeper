package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChessPickCardNotify {
    public enum ChessPickCardNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5304) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public ChessNormalCardInfo normalCardInfo = null;
    @Tag(tag=5) public Integer curseCardId = null;
}
