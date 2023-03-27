package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EnterIrodoriChessDungeonReq {
    public enum EnterIrodoriChessDungeonReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8505) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=1) public Integer levelId = null;
    @Tag(tag=6) public Boolean isHardMap = null;
}
