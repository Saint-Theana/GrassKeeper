package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PlayerDieType.*;
import org.sorapointa.proto.PlayerDieType;

public class WorldPlayerDieNotify {
    public enum WorldPlayerDieNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=202) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10) public Integer dieType = null;
    @Tag(tag=8) public Integer murdererEntityId = null;
    @Tag(tag=1) public Integer monsterId = null;
    @Tag(tag=4) public Integer gadgetId = null;
}
