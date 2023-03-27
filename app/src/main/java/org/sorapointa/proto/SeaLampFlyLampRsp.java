package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SeaLampFlyLampRsp {
    public enum SeaLampFlyLampRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2127) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public Integer itemNum = null;
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
    @Tag(tag=2) public Integer itemId = null;
}
