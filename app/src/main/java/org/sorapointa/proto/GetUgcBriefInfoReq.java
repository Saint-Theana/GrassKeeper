package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.UgcType.*;
import org.sorapointa.proto.UgcType;

public class GetUgcBriefInfoReq {
    @Tag(tag=7) public Long ugcGuid = null;
    @Tag(tag=10) public Integer ugcType = null;
}
