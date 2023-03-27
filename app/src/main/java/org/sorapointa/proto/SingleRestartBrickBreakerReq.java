package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SingleRestartBrickBreakerReq {
    public enum GOKOHKEIIJE {
        @Tag(tag=0) None ,
        @Tag(tag=23113) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=2) public Integer levelId = null;
    @Tag(tag=14) public Boolean isDungeon = null;
}
