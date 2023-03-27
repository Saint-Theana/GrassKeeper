package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GalleryCrystalLinkKillMonsterNotify {
    public enum GalleryCrystalLinkKillMonsterNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5539) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10) public Integer galleryId = null;
    @Tag(tag=9) public Integer score = null;
}
