package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FurnitureMakeCancelReq {
    public enum FurnitureMakeCancelReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4577) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=5) public Integer makeId = null;
    @Tag(tag=12) public Integer index = null;
}
