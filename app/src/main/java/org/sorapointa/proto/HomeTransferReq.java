package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeTransferReq {
    public enum HomeTransferReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4618) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=2) public Integer guid = null;
    @Tag(tag=11) public Boolean isTransferToSafePoint = null;
}
