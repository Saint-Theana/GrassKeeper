package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.BlossomBriefInfo.*;
import org.sorapointa.proto.BlossomBriefInfo;

public class GetBlossomBriefInfoListRsp {
    @Tag(tag=12,isSigned=true) public Integer retcode = null;
    @Tag(tag=11) public List<BlossomBriefInfo> briefInfoList = new ArrayList<>();
}
