package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FinishLanternProjectionReq {
    public enum FinishLanternProjectionReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8236) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=15) public Integer finishTime = null;
    @Tag(tag=10) public Integer levelId = null;
}
