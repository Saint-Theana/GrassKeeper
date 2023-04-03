package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.IrodoriChessPlayerInfo.*;
import org.sorapointa.proto.IrodoriChessPlayerInfo;

public class IrodoriChessPlayerInfoNotify {
    public enum IrodoriChessPlayerInfoNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5338) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public IrodoriChessPlayerInfo playerInfo = null;
}
