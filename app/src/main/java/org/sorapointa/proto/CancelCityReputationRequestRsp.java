package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CancelCityReputationRequestRsp {
    public enum CancelCityReputationRequestRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2824) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public Integer requestId = null;
    @Tag(tag=12,isSigned=true) public Integer retcode = null;
    @Tag(tag=14) public Integer cityId = null;
}
