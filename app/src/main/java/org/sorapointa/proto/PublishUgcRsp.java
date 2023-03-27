package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PublishUgcRsp {
    public enum PublishUgcRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=6325) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8) public Integer ugcType = null;
    @Tag(tag=14,isSigned=true) public Integer retcode = null;
    @Tag(tag=4) public Long ugcGuid = null;
}
