package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GalleryBalloonShootNotify {
    public enum GalleryBalloonShootNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5555) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8) public Integer galleryId = null;
    @Tag(tag=2) public Integer triggerEntityId = null;
    @Tag(tag=5,isSigned=true) public Integer addScore = null;
    @Tag(tag=14) public Integer curScore = null;
    @Tag(tag=7) public Integer combo = null;
    @Tag(tag=6) public Long comboDisableTime = null;
}
