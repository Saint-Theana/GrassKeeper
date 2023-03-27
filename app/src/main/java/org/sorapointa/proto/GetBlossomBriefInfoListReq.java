package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetBlossomBriefInfoListReq {
    public enum GetBlossomBriefInfoListReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2705) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=5) public List<Integer> cityIdList = new ArrayList<>();
}
