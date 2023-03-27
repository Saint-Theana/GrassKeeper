package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetUgcRsp {
    public enum GetUgcRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=6345) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12) public Integer ugcType = null;
    @Tag(tag=8,isSigned=true) public Integer retcode = null;
    @Tag(tag=7) public Integer ugcRecordUsage = null;
    @Tag(tag=9) public Long ugcGuid = null;
    @Tag(tag=1) public MusicRecord musicRecord = null;
    @Tag(tag=616) public UgcMusicBriefInfo musicBriefInfo = null;
}
