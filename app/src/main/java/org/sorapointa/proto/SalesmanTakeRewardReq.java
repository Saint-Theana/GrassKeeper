package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SalesmanTakeRewardReq {
    public enum SalesmanTakeRewardReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2060) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=7) public Integer scheduleId = null;
    @Tag(tag=10) public Integer position = null;
}
