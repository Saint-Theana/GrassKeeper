package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SingleStartBrickBreakerRsp {
    public enum BIHKAFCIBLF {
        @Tag(tag=0) None ,
        @Tag(tag=23349) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public Boolean isDungeon = null;
    @Tag(tag=11) public Integer levelId = null;
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
}
