package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetRecommendCustomDungeonRsp {
    public enum GetRecommendCustomDungeonRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=6206) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10) public List<OtherCustomDungeonBrief> customDungeonList = new ArrayList<>();
    @Tag(tag=12,isSigned=true) public Integer retcode = null;
}
