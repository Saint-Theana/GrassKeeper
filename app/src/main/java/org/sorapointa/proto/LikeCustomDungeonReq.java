package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class LikeCustomDungeonReq {
    public enum LikeCustomDungeonReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=6229) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=15) public Boolean isCancelLike = null;
    @Tag(tag=5) public Long dungeonGuid = null;
}
