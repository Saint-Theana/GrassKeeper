package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.OnlinePlayerInfo.*;
import org.sorapointa.proto.OnlinePlayerInfo;

public class PlayerApplyEnterHomeNotify {
    public enum PlayerApplyEnterHomeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4771) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public OnlinePlayerInfo srcPlayerInfo = null;
    @Tag(tag=13) public Integer srcAppId = null;
}
