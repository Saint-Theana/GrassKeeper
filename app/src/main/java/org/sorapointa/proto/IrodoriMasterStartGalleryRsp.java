package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class IrodoriMasterStartGalleryRsp {
    public enum IrodoriMasterStartGalleryRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8391) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10,isSigned=true) public Integer retcode = null;
}
