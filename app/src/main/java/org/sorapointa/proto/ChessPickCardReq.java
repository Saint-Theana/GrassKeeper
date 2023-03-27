package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChessPickCardReq {
    public enum ChessPickCardReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5391) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=9) public Integer cardIndex = null;
    @Tag(tag=3) public Integer cardId = null;
}
