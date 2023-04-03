package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.RecordUsage.*;
import org.sorapointa.proto.RecordUsage;
import org.sorapointa.proto.GetUgcType.*;
import org.sorapointa.proto.GetUgcType;
import org.sorapointa.proto.UgcType.*;
import org.sorapointa.proto.UgcType;

public class GetUgcReq {
    public enum GetUgcReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=6338) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=8) public Integer ugcRecordUsage = null;
    @Tag(tag=10) public Integer getUgcType = null;
    @Tag(tag=15) public Long ugcGuid = null;
    @Tag(tag=2) public Integer ugcType = null;
    @Tag(tag=5) public Boolean isRequireBrief = null;
}
