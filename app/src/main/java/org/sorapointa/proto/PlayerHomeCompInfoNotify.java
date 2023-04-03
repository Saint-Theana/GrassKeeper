package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PlayerHomeCompInfo.*;
import org.sorapointa.proto.PlayerHomeCompInfo;

public class PlayerHomeCompInfoNotify {
    public enum PlayerHomeCompInfoNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4844) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5) public PlayerHomeCompInfo compInfo = null;
}
