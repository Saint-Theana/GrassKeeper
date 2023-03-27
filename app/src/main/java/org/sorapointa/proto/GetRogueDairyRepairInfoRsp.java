package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetRogueDairyRepairInfoRsp {
    public enum GetRogueDairyRepairInfoRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8881) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9,isSigned=true) public Integer retcode = null;
}
