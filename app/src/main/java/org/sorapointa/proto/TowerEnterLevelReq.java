package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TowerEnterLevelReq {
    public enum TowerEnterLevelReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2424) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=9) public Integer enterPointId = null;
}
