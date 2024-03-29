package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ChessPlayerInfo.*;
import org.sorapointa.proto.ChessPlayerInfo;

public class ChessPlayerInfoNotify {
    public enum ChessPlayerInfoNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5326) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public ChessPlayerInfo playerInfo = null;
}
