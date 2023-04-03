package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GalleryStartSource.*;
import org.sorapointa.proto.GalleryStartSource;

public class GalleryWillStartCountdownNotify {
    public enum GalleryWillStartCountdownNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5575) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8) public Integer galleryId = null;
    @Tag(tag=1) public Boolean isEnd = null;
    @Tag(tag=13) public Integer startSource = null;
    @Tag(tag=9) public Integer endTime = null;
}
