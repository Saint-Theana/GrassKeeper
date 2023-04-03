package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PlayerDieType.*;
import org.sorapointa.proto.PlayerDieType;

public class DungeonPlayerDieReq {
    public enum DungeonPlayerDieReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=913) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=14) public Integer dungeonId = null;
    @Tag(tag=1) public Integer dieType = null;
}
