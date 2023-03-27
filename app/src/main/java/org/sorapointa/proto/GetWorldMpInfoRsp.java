package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetWorldMpInfoRsp {
    public enum GetWorldMpInfoRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3320) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12,isSigned=true) public Integer retcode = null;
    @Tag(tag=11) public Boolean isInMpMode = null;
    @Tag(tag=15) public Integer quitMpValidTime = null;
}
