package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.UgcType.*;
import org.sorapointa.proto.UgcType;

public class GetUgcBriefInfoReq {
    public enum GetUgcBriefInfoReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=6346) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=10) public Integer ugcType = null;
    @Tag(tag=11) public Long ugcGuid = null;
}
