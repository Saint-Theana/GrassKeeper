package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChessPickCardRsp {
    public enum ChessPickCardRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5360) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10) public Integer cardIndex = null;
    @Tag(tag=8) public Integer cardId = null;
    @Tag(tag=7,isSigned=true) public Integer retcode = null;
}
