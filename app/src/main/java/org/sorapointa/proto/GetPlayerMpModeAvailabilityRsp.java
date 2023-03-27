package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetPlayerMpModeAvailabilityRsp {
    public enum GetPlayerMpModeAvailabilityRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1825) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12,isSigned=true) public Integer mpRet = null;
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
    @Tag(tag=7) public List<Integer> paramList = new ArrayList<>();
}
