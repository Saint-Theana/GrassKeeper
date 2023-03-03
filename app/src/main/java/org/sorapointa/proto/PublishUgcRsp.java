package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.UgcType.*;
import org.sorapointa.proto.UgcType;

public class PublishUgcRsp {
    @Tag(tag=14) public Long ugcGuid = null;
    @Tag(tag=15,isSigned=true) public Integer retcode = null;
    @Tag(tag=13) public Integer ugcType = null;
}
