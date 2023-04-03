package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.UgcType.*;
import org.sorapointa.proto.UgcType;

public class PublishUgcReq {
    public enum PublishUgcReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=6316) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=9) public Integer ugcType = null;
    @Tag(tag=14) public Long ugcGuid = null;
}
