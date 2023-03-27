package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GallerySumoKillMonsterNotify {
    public enum GallerySumoKillMonsterNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5506) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2) public Integer score = null;
    @Tag(tag=13) public Integer killNormalMosnterNum = null;
    @Tag(tag=4) public Integer killEliteMonsterNum = null;
    @Tag(tag=10) public Integer galleryId = null;
}
