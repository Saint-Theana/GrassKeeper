package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MultistagePlaySettleNotify {
    public enum MultistagePlaySettleNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5347) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public Integer playIndex = null;
    @Tag(tag=1) public Integer groupId = null;
    @Tag(tag=1241) public MechanicusSettleInfo mechanicusSettleInfo = null;
    @Tag(tag=200) public ChessSettleInfo chessSettleInfo = null;
    @Tag(tag=96) public IrodoriChessSettleInfo irodoriChessSettleInfo = null;
}
