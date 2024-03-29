package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MaterialDeleteReturnType.*;
import org.sorapointa.proto.MaterialDeleteReturnType;

public class TakeMaterialDeleteReturnReq {
    public enum TakeMaterialDeleteReturnReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=656) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=6) public Integer type = null;
}
