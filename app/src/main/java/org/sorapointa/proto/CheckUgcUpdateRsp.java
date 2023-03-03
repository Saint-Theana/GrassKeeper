package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.UgcType.*;
import org.sorapointa.proto.UgcType;

public class CheckUgcUpdateRsp {
    @Tag(tag=15) public List<Long> updateUgcGuidList = new ArrayList<>();
    @Tag(tag=10,isSigned=true) public Integer retcode = null;
    @Tag(tag=12) public Integer ugcType = null;
}
