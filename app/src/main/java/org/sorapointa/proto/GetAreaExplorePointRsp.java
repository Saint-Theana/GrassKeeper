package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetAreaExplorePointRsp {
    public enum GetAreaExplorePointRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=252) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public List<Integer> areaIdList = new ArrayList<>();
    @Tag(tag=14,isSigned=true) public Integer retcode = null;
    @Tag(tag=3) public List<Integer> explorePointList = new ArrayList<>();
}
