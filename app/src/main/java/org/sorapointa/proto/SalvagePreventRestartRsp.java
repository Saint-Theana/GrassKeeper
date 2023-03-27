package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SalvagePreventRestartRsp {
    public enum SalvagePreventRestartRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8904) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12,isSigned=true) public Integer retcode = null;
    @Tag(tag=3) public Integer galleryId = null;
}
