package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.BlossomBriefInfo.*;
import org.sorapointa.proto.BlossomBriefInfo;

public class GetBlossomBriefInfoListRsp {
    public enum GetBlossomBriefInfoListRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2755) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=2,isSigned=true) public Integer retcode = null;
    @Tag(tag=4) public List<BlossomBriefInfo> briefInfoList = new ArrayList<>();
}
