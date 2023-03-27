package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CancelCityReputationRequestReq {
    public enum CancelCityReputationRequestReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2814) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=4) public Integer cityId = null;
    @Tag(tag=3) public Integer requestId = null;
}
