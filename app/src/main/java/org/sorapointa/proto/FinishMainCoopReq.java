package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FinishMainCoopReq {
    public enum FinishMainCoopReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1969) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=11) public Integer id = null;
    @Tag(tag=5) public Integer endingSavePointId = null;
}
