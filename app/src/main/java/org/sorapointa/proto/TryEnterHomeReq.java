package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TryEnterHomeReq {
    public enum TryEnterHomeReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4455) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=11) public Integer targetPoint = null;
    @Tag(tag=4) public Boolean isTransferToSafePoint = null;
    @Tag(tag=6) public Integer targetUid = null;
}
