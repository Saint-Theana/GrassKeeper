package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerApplyEnterMpNotify {
    public enum PlayerApplyEnterMpNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1838) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14) public Integer srcThreadIndex = null;
    @Tag(tag=11) public OnlinePlayerInfo srcPlayerInfo = null;
    @Tag(tag=12) public Integer srcAppId = null;
}
