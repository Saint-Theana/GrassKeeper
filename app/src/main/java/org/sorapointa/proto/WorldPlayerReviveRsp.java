package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WorldPlayerReviveRsp {
    public enum WorldPlayerReviveRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=221) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=6,isSigned=true) public Integer retcode = null;
}
