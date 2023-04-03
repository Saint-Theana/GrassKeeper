package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.EnterCustomDungeonType.*;
import org.sorapointa.proto.EnterCustomDungeonType;

public class EnterCustomDungeonReq {
    public enum EnterCustomDungeonReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=6238) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=2) public Integer enterType = null;
    @Tag(tag=13) public Integer dungeonId = null;
    @Tag(tag=3) public Long dungeonGuid = null;
}
