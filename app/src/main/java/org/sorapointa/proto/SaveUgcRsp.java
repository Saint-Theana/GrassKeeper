package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.UgcType.*;
import org.sorapointa.proto.UgcType;

public class SaveUgcRsp {
    @Tag(tag=15,isSigned=true) public Integer retcode = null;
    @Tag(tag=8) public Long ugcGuid = null;
    @Tag(tag=1) public Integer ugcType = null;
}
