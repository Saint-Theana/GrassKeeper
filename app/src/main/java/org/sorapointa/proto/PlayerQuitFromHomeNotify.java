package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PlayerQuitFromHomeNotify_QuitReason.*;
import org.sorapointa.proto.PlayerQuitFromHomeNotify_QuitReason;

public class PlayerQuitFromHomeNotify {
    public enum PlayerQuitFromHomeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4835) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10) public Integer reason = null;
}
