package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetAuthSalesmanInfoRsp {
    public enum GetAuthSalesmanInfoRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2113) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14) public Integer scheduleId = null;
    @Tag(tag=6,isSigned=true) public Integer retcode = null;
    @Tag(tag=13) public Integer dayRewardId = null;
}
