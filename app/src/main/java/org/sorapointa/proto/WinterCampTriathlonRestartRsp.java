package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WinterCampTriathlonRestartRsp {
    public enum WinterCampTriathlonRestartRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8323) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14,isSigned=true) public Integer retcode = null;
    @Tag(tag=13) public Integer galleryId = null;
}
