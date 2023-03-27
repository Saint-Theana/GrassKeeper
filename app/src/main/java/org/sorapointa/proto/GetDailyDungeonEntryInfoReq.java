package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetDailyDungeonEntryInfoReq {
    public enum GetDailyDungeonEntryInfoReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=981) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=4) public Integer sceneId = null;
}
