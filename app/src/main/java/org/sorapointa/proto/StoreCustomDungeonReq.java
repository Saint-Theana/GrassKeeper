package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class StoreCustomDungeonReq {
    public enum StoreCustomDungeonReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=6211) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=5) public Boolean isCancelStore = null;
    @Tag(tag=2) public Long dungeonGuid = null;
}
