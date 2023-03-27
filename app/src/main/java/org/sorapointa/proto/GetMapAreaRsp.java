package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetMapAreaRsp {
    public enum GetMapAreaRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3213) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=3) public List<MapAreaInfo> mapAreaInfoList = new ArrayList<>();
    @Tag(tag=2,isSigned=true) public Integer retcode = null;
}
