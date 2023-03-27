package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class StartBuoyantCombatGalleryRsp {
    public enum StartBuoyantCombatGalleryRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8895) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10,isSigned=true) public Integer retcode = null;
    @Tag(tag=8) public Integer galleryLevel = null;
    @Tag(tag=7) public Integer galleryId = null;
}
