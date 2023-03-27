package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AnchorPointOpReq {
    public enum AnchorPointOpReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4291) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=15) public Integer anchorPointId = null;
    @Tag(tag=3) public Integer anchorPointOpType = null;
}
