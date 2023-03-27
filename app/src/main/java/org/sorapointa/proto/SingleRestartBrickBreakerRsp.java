package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SingleRestartBrickBreakerRsp {
    public enum KBGKBIPOJLC {
        @Tag(tag=0) None ,
        @Tag(tag=22641) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public Boolean isDungeon = null;
    @Tag(tag=6,isSigned=true) public Integer retcode = null;
    @Tag(tag=10) public Integer levelId = null;
}
