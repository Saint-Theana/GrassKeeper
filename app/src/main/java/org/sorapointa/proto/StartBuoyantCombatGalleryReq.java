package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class StartBuoyantCombatGalleryReq {
    public enum StartBuoyantCombatGalleryReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8096) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=11) public Integer galleryId = null;
    @Tag(tag=7) public Integer galleryLevel = null;
}
