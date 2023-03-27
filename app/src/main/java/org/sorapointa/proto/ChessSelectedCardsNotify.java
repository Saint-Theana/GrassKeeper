package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChessSelectedCardsNotify {
    public enum ChessSelectedCardsNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5334) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public List<ChessCardInfo> selectedCardInfoList = new ArrayList<>();
}
