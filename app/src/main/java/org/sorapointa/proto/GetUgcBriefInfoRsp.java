package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetUgcBriefInfoRsp {
    public enum GetUgcBriefInfoRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=6341) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public Long ugcGuid = null;
    @Tag(tag=9) public Integer ugcType = null;
    @Tag(tag=1,isSigned=true) public Integer retcode = null;
    @Tag(tag=8) public MusicBriefInfo musicBriefInfo = null;
}
