package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GetUgcType.*;
import org.sorapointa.proto.GetUgcType;
import org.sorapointa.proto.RecordUsage.*;
import org.sorapointa.proto.RecordUsage;
import org.sorapointa.proto.UgcType.*;
import org.sorapointa.proto.UgcType;

public class GetUgcReq {
    @Tag(tag=8) public Integer ugcType = null;
    @Tag(tag=5) public Long ugcGuid = null;
    @Tag(tag=6) public Integer ugcRecordUsage = null;
    @Tag(tag=11) public Boolean isRequireBrief = null;
    @Tag(tag=13) public Integer getUgcType = null;
}
