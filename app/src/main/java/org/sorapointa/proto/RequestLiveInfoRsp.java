package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RequestLiveInfoRsp {
    public enum RequestLiveInfoRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=828) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=3) public String liveUrl = null;
    @Tag(tag=15,isSigned=true) public Integer retcode = null;
    @Tag(tag=11) public Integer liveId = null;
    @Tag(tag=1) public String spareLiveUrl = null;
}
