package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.UgcType.*;
import org.sorapointa.proto.UgcType;

public class PublishUgcReq {
    @Tag(tag=7) public Integer ugcType = null;
    @Tag(tag=12) public Long ugcGuid = null;
}
