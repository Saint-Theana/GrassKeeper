package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeBalloonGalleryScoreNotify {
    public enum HomeBalloonGalleryScoreNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4839) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public Integer triggerEntityId = null;
    @Tag(tag=7) public Integer curScore = null;
    @Tag(tag=10) public Integer addScore = null;
    @Tag(tag=14) public Integer galleryId = null;
}
