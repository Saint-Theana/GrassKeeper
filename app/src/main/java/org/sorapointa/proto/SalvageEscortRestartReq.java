package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SalvageEscortRestartReq {
    public enum SalvageEscortRestartReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8100) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=6) public Integer galleryId = null;
}
